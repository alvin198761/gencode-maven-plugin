package org.alvin.gencode.run.config;

import lombok.extern.slf4j.Slf4j;
import org.alvin.code.jdbc.ConnectionUtils;
import org.alvin.gencode.beans.PropConfig;
import org.alvin.gencode.run.code.CodeService;
import org.alvin.gencode.utils.ConfigUtil;
import org.alvin.mini_inject.annotations.MiniComponent;
import org.alvin.mini_inject.annotations.MiniInject;
import org.alvin.mini_inject.annotations.MiniRun;

import java.io.IOException;

@Slf4j
@MiniComponent
public class GenCodePluginConfig {

    @MiniInject
    private CodeService codeService;

    @MiniRun
    public void start() {
        try {
            log.info("启动配置加载");
            PropConfig propConfig = ConfigUtil.initConfig();
            log.info("初始化数据库连接");
            this.initConnectionConfig(propConfig);
            log.info("生成代码");
            this.codeService.genCode(propConfig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initConnectionConfig(PropConfig propConfig) {
        try {
            ConnectionUtils.init(propConfig.getDriverClassName(), propConfig.getUrl(), propConfig.getUsername(), propConfig.getPassword());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
