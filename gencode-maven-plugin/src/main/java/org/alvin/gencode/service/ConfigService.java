package org.alvin.gencode.service;

import lombok.extern.slf4j.Slf4j;
import org.alvin.gencode.config.PropConfig;
import org.alvin.mini_inject.annotations.MiniComponent;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

@Slf4j
@MiniComponent
public class ConfigService {

    public PropConfig initConfig() throws IOException {
        String path = System.getProperty("config");
        log.info("配置文件路径:" + path);
        try (InputStream is = Files.newInputStream(Paths.get(path))) {
            Properties properties = new Properties();
            properties.load(is);
            PropConfig propConfig = new PropConfig();
            properties.forEach((k, v) -> {
                try {
                    Field field = PropConfig.class.getDeclaredField(k.toString());
                    if (field == null) {
                        return;
                    }
                    boolean flag = field.isAccessible();
                    try {
                        field.setAccessible(true);
                        field.set(propConfig, v.toString().replace("${basedir}", System.getProperty("user.dir")));
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        field.setAccessible(flag);
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            });
            return propConfig;
        }
    }
}
