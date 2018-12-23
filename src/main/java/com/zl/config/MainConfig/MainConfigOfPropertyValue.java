package com.zl.config.MainConfig;

import com.zl.config.dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Copyright (C)，XX
 * FileName: MainConfigOfPropertyValue
 * Author: zl
 * Date: 2018/12/23  9:54
 * Description: @Value注解的主类
 **/

@PropertySource(value = {"classpath:PersonDao.properties"})
@Configuration
public class MainConfigOfPropertyValue {

    @Bean
    public PersonDao personDao(){
        return new PersonDao();
    }
}
