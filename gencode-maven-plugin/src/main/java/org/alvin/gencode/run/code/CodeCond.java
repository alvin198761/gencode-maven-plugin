package org.alvin.gencode.run.code;

import lombok.Data;

import java.util.List;

import org.alvin.code.jdbc.beans.BaseCondition;

@Data
public class CodeCond extends BaseCondition {

    @Override
    public void addCondition() {
        add(t_name, "AND table_name LIKE ?", 3);
        add(t_name_eq, "AND table_name = ?");
        add(table_schema, "AND table_schema=?");
        add(tableNameNotIn, "AND table_name not in ");
    }

    private String t_name;// 表名模糊
    private String t_name_eq;// 表名等于
    private String table_schema;// 数据名
    private List<String> tableNameNotIn; //表名称排除

    private String db_user;// 数据库用户名
    //
    private String author;// 作者名
    private String packageName; //包名
    private List<Table> c_list;// 生成代码用的数据

    private List<String> templateDirs; //模板目录选择

    private String sql;


}