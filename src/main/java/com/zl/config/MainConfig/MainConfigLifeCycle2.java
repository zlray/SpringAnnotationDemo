package com.zl.config.MainConfig;

import com.zl.config.dao.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C)，XX
 * FileName: MainConfigLifeCycle
 * Author: zl
 * Date: 2018/12/16  22:33
 * Description: Bean的生命周期
 **/

@Configuration
public class MainConfigLifeCycle2 {

    @Bean
    public Train train(){
        return new Train();
    }
}
