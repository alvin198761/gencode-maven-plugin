package org.alvin.gencode.service;

import org.alvin.mini_inject.annotations.MiniComponent;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 唐植超
 * @date 2019/09/12
 */
@MiniComponent
public class JDBC2MbTypeService  {

    private Properties properties = new Properties();

    public JDBC2MbTypeService(){
        try {
            properties.load(this.getClass().getResourceAsStream("/jdbctypemap.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getType(String key) {
        return this.properties.getProperty(key);
    }

}
