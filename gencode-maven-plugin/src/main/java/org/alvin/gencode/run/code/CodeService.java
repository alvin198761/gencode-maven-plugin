package org.alvin.gencode.run.code;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.alvin.gencode.beans.PropConfig;
import org.alvin.gencode.run.service.JDBC2MbTypeService;
import org.alvin.gencode.run.service.VmFileService;
import org.alvin.gencode.utils.Utils;
import org.alvin.gencode.utils.VelocityUtil;
import org.alvin.mini_inject.annotations.MiniComponent;
import org.alvin.mini_inject.annotations.MiniInject;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @类说明: 收寄信息--数据逻辑层
 * @author: 唐植超
 * @date : 2019-11-17  9:18:43
 **/
@Slf4j
@MiniComponent
public class CodeService {

    @MiniInject
    private CodeDao codeDao;
    @MiniInject
    private VmFileService vmFileService;
    @MiniInject
    private JDBC2MbTypeService jdbc2MbTypeService;

    /**
     * 代码生成
     *
     * @param propConfig
     */
    public void genCode(PropConfig propConfig) {
        //读取配置确定需要生成的类
        Path path = Paths.get(propConfig.getConfigDir().concat(File.separator).concat("gcode.rmb"));
        List<String> list = Lists.newArrayList();
        if (Files.exists(path)) {
            try {
                list = Files.readAllLines(path);
                log.info("递增执行,过滤掉数据表:" + list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        CodeCond codeCond = new CodeCond();
        codeCond.setTableNameNotIn(list);
        try {
            codeCond.setTable_schema(propConfig.getDbName());
            List<Table> tables = this.codeDao.queryTables(codeCond);
            this.doCreate(tables, propConfig);
            list.addAll(tables.stream().map(Table::getT_name).collect(Collectors.toList()));
            String lines = list.stream().collect(Collectors.joining(System.getProperty("line.separator")));
            Files.write(path, lines.getBytes("utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 代码生成实际逻辑
     *
     * @param tables
     * @param propConfig
     * @throws IOException
     */
    private void doCreate(List<Table> tables, PropConfig propConfig) throws IOException {
        String suffix = ".vm";
        String dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String templateDir = propConfig.getConfigDir().concat(File.separator).concat("templates");
        String outDir = propConfig.getConfigDir().concat(File.separator).concat("dist");
        VelocityEngine fileEngine = VelocityUtil.fileVelocityEngine(templateDir);
        String[] files = new File(templateDir).list();
        if (files == null || files.length == 0) {
            log.error("没有找到模板");
            return;
        }
        List<String> vms = vmFileService.scanTemplate(templateDir, suffix, Lists.newArrayList(files));
        if (vms.isEmpty()) {
            log.error("没有找到模板");
            return;
        }
        for (Table table : tables) {
            log.info("表格:" + table.getT_name() + " 生成");
            //用工参数
            CodeCond codeCond = new CodeCond();
            codeCond.setT_name_eq(table.getT_name());
            List<Field> fList = null;// 字段列表
            try {
                fList = codeDao.queryFields(codeCond).stream().map(item -> {
                    item.setLower_camel(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, item.getName()));
                    item.setUpper_camel(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, item.getName()));
                    if (item.getAllTypeName().indexOf(".") != -1) {
                        int index = item.getAllTypeName().lastIndexOf(".");
                        item.setType(item.getAllTypeName().substring(index + 1));
                    } else {
                        item.setType(item.getAllTypeName());
                    }
                    item.setMb_db_type(this.jdbc2MbTypeService.getType(item.getDbType()));
                    return item;
                }).collect(Collectors.toList());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String cName = table.getC_name();// 表注释中文名
            String upp = table.getCls_upp();// 驼峰类名(首字母大写)
            String low = upp.toLowerCase();// 类名小写(只用包路径)
            String idType = Utils.keyType(fList);// 主键数据类型
            Field idField = fList.stream().filter(item -> item.getColumn_key().equals("PRI")).findFirst().get();

            //组装对象
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("fList", fList);
            jsonObject.put("auth", propConfig.getAuthor());
            jsonObject.put("cName", cName);
            jsonObject.put("lowUpp", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, upp));
            jsonObject.put("idType", idType);
            jsonObject.put("id", idField);
            jsonObject.put("table", table);
            jsonObject.put("tName", table.getT_name());
            jsonObject.put("comment", table.getComment());
            jsonObject.put("c_name", table.getC_name());
            jsonObject.put("idName", idField.getName());
            //类名称
            jsonObject.put("clsUpp", upp);
            jsonObject.put("time", dateFormat);
            //各种参数追加
            jsonObject.put("selectFields", Utils.add(fList, "t.", ",", false, "select"));
            jsonObject.put("insertFields", Utils.add(fList, "", ",", true, "insert"));
            jsonObject.put("insertValuesFields", Utils.add(fList, ":", ",", true, "insert"));
            jsonObject.put("replaceFields", Utils.add(fList, "", ",", false, "sql"));
            jsonObject.put("replaceValuesFields", Utils.add(fList));
//            jsonObject.put("paramsFields", Utils.addV1(fList, "vo.get", "(),", false));
            jsonObject.put("updateFields", Utils.add(fList, "", "=?,", true, "sql"));
//            jsonObject.put("updateParams", Utils.addV1(fList, "vo.get", "(),", true) + ",vo.get" + idField.getName() + "()");
            jsonObject.put("selectItems", Utils.add(fList, "t.", ","));
            jsonObject.put("caseMapper", Utils.caseMapper(fList));
            //v2 需要兼容的东西
            jsonObject.put("paramsFieldsV2", Utils.addV2(fList, "vo.get", "(),", false));
            jsonObject.put("updateParamsV2", Utils.addV2(fList, "vo.get", "(),", true) + ",vo.get" + idField.getUpper_camel() + "()");
            //特殊字符
            jsonObject.put("dollar", "$");
            jsonObject.put("sharp", "#");
            jsonObject.put("tShortName", Arrays.asList(table.getT_name().split("_")).stream().map(v -> v.substring(0,1)).collect(Collectors.joining("")));
            //java 代码生成
            VelocityUtil.parseEntityTemplate(vms, outDir, jsonObject, propConfig.getPackageName(), low, suffix, fileEngine);
        }

    }

//    @JDBCTransction
}
