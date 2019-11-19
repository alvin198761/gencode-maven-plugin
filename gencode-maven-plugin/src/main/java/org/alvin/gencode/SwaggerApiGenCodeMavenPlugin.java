package org.alvin.gencode;

import lombok.extern.slf4j.Slf4j;
import org.alvin.mini_inject.InjectContext;
import org.alvin.mini_inject.annotations.MiniServiceScan;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author 唐植超
 * @date 2019/11/19
 */
@Slf4j
@MiniServiceScan("org.alvin.gencode.swagger")
@Mojo(name = "swaggerapi", defaultPhase = LifecyclePhase.NONE)
public class SwaggerApiGenCodeMavenPlugin extends AbstractMojo {

    @Parameter
    private String config;

    @Override
    public void execute() {
        System.getProperties().put("config", this.config);
        InjectContext.run(SwaggerApiGenCodeMavenPlugin.class, new String[]{this.config});
    }
}
