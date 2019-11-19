package org.alvin.gencode;

import lombok.extern.slf4j.Slf4j;
import org.alvin.gencode.beans.PropConfig;
import org.alvin.gencode.utils.ConfigUtil;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author 唐植超
 * @date 2019/11/19
 */
@Slf4j
@Mojo(name = "clean", defaultPhase = LifecyclePhase.NONE)
public class CleanMavenPlugin extends AbstractMojo {

    @Parameter
    private String config;

    @Override
    public void execute() {
        log.info("启动配置加载");
        try {
            PropConfig propConfig = ConfigUtil.initConfig();
            log.info("开始清除文件");
            Path path = Paths.get(propConfig.getConfigDir(), "gcode.rmb");
            log.info("删除gcode.rmb");
            Files.delete(path);
            log.info("清除dist目录");
            path = Paths.get(propConfig.getConfigDir(), "dist");
            Files.walkFileTree(path, new FileVisitor<Path>() {

                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
