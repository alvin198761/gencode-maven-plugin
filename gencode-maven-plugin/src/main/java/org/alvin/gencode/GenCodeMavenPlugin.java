package org.alvin.gencode;

import lombok.extern.slf4j.Slf4j;
import org.alvin.mini_inject.InjectContext;
import org.alvin.mini_inject.annotations.MiniServiceScan;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

@Slf4j
@MiniServiceScan("org.alvin.gencode")
@Mojo(name = "run", defaultPhase = LifecyclePhase.NONE)
public class GenCodeMavenPlugin extends AbstractMojo {

    @Parameter
    private String config;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.getProperties().put("config", this.config);
        InjectContext.run(GenCodeMavenPlugin.class, new String[]{this.config});
    }

    public static void main(String[] args) {
        String path = System.getProperty("user.dir").concat(File.separator).concat("src").concat(File.separator).concat("config").concat(File.separator).concat("config.properties");
        System.getProperties().put("config", path);
        InjectContext.run(GenCodeMavenPlugin.class, args);
    }
}
