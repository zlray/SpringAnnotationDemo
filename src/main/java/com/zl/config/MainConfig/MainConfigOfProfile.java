package com.zl.config.MainConfig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Copyright (C)，XX
 * FileName: MainConfigOfProfile
 * Author: zl
 * Date: 2018/12/23  16:35
 * Description: @Profile的配置类
 **/

@Profile("test") //测试环境,test类中为dev
@PropertySource("classpath:db.properties")
@Configuration
public class MainConfigOfProfile {

    @Value("${db.user}")
    private String user;
    @Value("${db.password}")
    private String password;
    @Value("${db.driverClass}")
    private String driveClass;


    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceTest() throws Exception {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driveClass);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/loginsql?serverTimezone=GMT");
        return dataSource;
    }
    @Profile("dev")
    @Bean("developDataSource")
    public DataSource dataSourceDevelopment(@Value("${db.user}") String user,
                                      @Value("${db.password}") String password,
                                      @Value("${db.driverClass}") String driveClass) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driveClass);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=GMT");
        return dataSource;
    }
}
