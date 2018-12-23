package com.zl.config.MainConfig;

import com.zl.config.dao.Aircraft;
import com.zl.config.dao.CarLifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Copyright (C)，XX
 * FileName: MainConfigLifeCycle
 * Author: zl
 * Date: 2018/12/16  22:33
 * Description: Bean的生命周期
 **/

@Configuration
public class MainConfigLifeCycle {

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public CarLifeCycle carLifeCycle(){
        return new CarLifeCycle();
    }

    @Bean
    public Aircraft aircraft(){
        return new Aircraft();
    }
}
