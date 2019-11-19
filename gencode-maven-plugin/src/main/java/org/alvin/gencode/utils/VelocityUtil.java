package org.alvin.gencode.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.runtime.resource.loader.FileResourceLoader;
import org.apache.velocity.runtime.resource.loader.JarResourceLoader;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

@Slf4j
public class VelocityUtil {

    public static final String UTF_8 = "utf-8";

    /**
     * 通过class path 加载
     *
     * @return
     */
    public static VelocityEngine classPathVelocityEngine() {
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        ve.setProperty(Velocity.ENCODING_DEFAULT, UTF_8);
        ve.setProperty(Velocity.INPUT_ENCODING, UTF_8);
        ve.setProperty(Velocity.OUTPUT_ENCODING, UTF_8);
        ve.init();
        return ve;
    }

    /**
     * 通过文件加载
     *
     * @return
     */
    public static VelocityEngine fileVelocityEngine(String path) {
        //初始化参数
        Properties properties = new Properties();
        //设置velocity资源加载方式为file
        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "file");
        //设置velocity资源加载方式为file时的处理类
        properties.setProperty("file.resource.loader.class", FileResourceLoader.class.getName());
        properties.setProperty(Velocity.ENCODING_DEFAULT, UTF_8);
        properties.setProperty(Velocity.INPUT_ENCODING, UTF_8);
        properties.setProperty(Velocity.OUTPUT_ENCODING, UTF_8);
        properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, path);
        //实例化一个VelocityEngine对象
        return new VelocityEngine(properties);
    }

    /**
     * 通过jar 加载
     *
     * @param jarURI
     * @return
     */
    public static VelocityEngine jarVelocityEngine(String jarURI) {
        //初始化参数
        Properties properties = new Properties();
        //设置velocity资源加载方式为jar
        properties.setProperty("resource.loader", "jar");
        //设置velocity资源加载方式为file时的处理类
        properties.setProperty("jar.resource.loader.class", JarResourceLoader.class.getName());
        properties.setProperty(Velocity.ENCODING_DEFAULT, UTF_8);
        properties.setProperty(Velocity.INPUT_ENCODING, UTF_8);
        properties.setProperty(Velocity.OUTPUT_ENCODING, UTF_8);
        //设置jar包所在的位置 jarURI "jar:file:WebRoot/WEB-INF/lib/vm.jar"
        properties.setProperty("jar.resource.loader.path", jarURI);
        //实例化一个VelocityEngine对象
        return new VelocityEngine(properties);
    }

    /**
     * 转换
     *
     * @param templateName
     * @param obj
     * @param outPath
     * @param velocityEngine
     */
    public static void parse(String templateName, Object obj, String outPath, VelocityEngine velocityEngine) {
        Template t = velocityEngine.getTemplate(templateName, UTF_8);
        t.setEncoding(UTF_8);
        VelocityContext ctx = new VelocityContext();
        JSONObject.parseObject(JSONObject.toJSONString(obj)).forEach(ctx::put);
        try (Writer writer = Files.newWriter(new File(outPath), Charset.forName(UTF_8))) {
            t.merge(ctx, writer);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换
     *
     * @param templateName
     * @param obj
     * @param velocityEngine
     */
    public static String parse(String templateName, Object obj, VelocityEngine velocityEngine) throws IOException {
        Template t = velocityEngine.getTemplate(templateName, UTF_8);
        t.setEncoding(UTF_8);
        VelocityContext ctx = new VelocityContext();
        JSONObject.parseObject(JSONObject.toJSONString(obj)).forEach(ctx::put);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (Writer writer = new OutputStreamWriter(bos, UTF_8)) {
            t.merge(ctx, writer);
            writer.flush();
            return new String(bos.toByteArray(), UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * 实体类生成算法
     *
     * @param vms
     * @param jsonObject
     * @param packageName
     * @param low
     * @param suffix
     * @throws IOException
     */
    public static void parseEntityTemplate(List<String> vms, String outDir, JSONObject jsonObject, String packageName, String low, String suffix, VelocityEngine engine) throws IOException {
        //循环模板，进行合并
        for (String vm : vms) {
            //获得文件名称
            log.info("template file :" + vm);
            //计算包名
            String pName = packageName.concat(".").concat(low);
            File templateFile = new File(vm);
            String vmName = templateFile.getName().substring(0, templateFile.getName().lastIndexOf(suffix));
            String fileType = vmName.substring(vmName.lastIndexOf("_")).replace('_', '.');
            String upp = vmName.replaceAll("Model", jsonObject.getString("clsUpp"));
            upp = upp.substring(0, upp.length() - fileType.length());
            jsonObject.put("upp", upp);
            String path = Paths.get(outDir, templateFile.getParentFile().getName(), low, upp).toFile().getAbsolutePath();
            log.info("target file :" + path + fileType);
            log.info("=================start VelocityEngine==================");
            jsonObject.put("pName", pName);
            java.nio.file.Files.createDirectories(Paths.get(path).getParent());
            VelocityUtil.parse(vm, jsonObject, path + fileType, engine);
            log.info("=================end VelocityEngine==================");
        }
    }


}
