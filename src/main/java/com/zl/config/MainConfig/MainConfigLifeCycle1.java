package com.zl.config.MainConfig;

import com.zl.config.dao.Aircraft;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C)，XX
 * FileName: MainConfigLifeCycle
 * Author: zl
 * Date: 2018/12/16  22:33
 * Description: Bean的生命周期
 **/

@ComponentScan("com.zl.config")
@Configuration
public class MainConfigLifeCycle1 {

    @Bean
    public Aircraft aircraft(){
        return new Aircraft();
    }
}
