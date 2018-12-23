package com.zl.config.dao;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Copyright (C)，XX
 * FileName: Train
 * Author: zl
 * Date: 2018/12/17  22:16
 * Description: @PostConstruct  @PreDestroy
 **/
@Component
public class Train {

    public Train(){
        System.out.println("Train Construct.....");
    }

    @PostConstruct
    public void init(){
        System.out.println("Train PostConstruct.....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Train PreDestroy.....");
    }
}
