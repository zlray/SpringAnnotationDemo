package SpringBeanDemo;

import java.util.Properties;

/**
 * Copyright (C)，XX
 * FileName: DataSource
 * Author: zl
 * Date: 2018/11/29  22:16
 * Description: properties属性
 **/
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
