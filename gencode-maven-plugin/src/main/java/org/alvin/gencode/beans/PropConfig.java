package org.alvin.gencode.beans;

import lombok.Data;

@Data
public class PropConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    private String packageName;
    private String author;
    private String configDir;
    private String dbName;

    private String swaggerUrl;
    private String swaggerApiType;




}
