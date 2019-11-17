package org.alvin.gencode.config;

import lombok.Data;

@Data
public class PropConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    private String packageName;
    private String mode;
    private String author;
    private String configDir;
    private String dbName;

}
