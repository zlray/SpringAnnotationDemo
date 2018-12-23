package com.zl.config.dao;



/**
 * Copyright (C)，XX
 * FileName: CarLifeCyle
 * Author: zl
 * Date: 2018/12/17  21:05
 * Description: Bean LifeCycle  Bean的生命周期
 **/
public class CarLifeCycle {

    public CarLifeCycle(){
        System.out.println("Car construct");

    }

    public void init(){
        System.out.println("Car init.....");

    }
    public void destroy(){
        System.out.println("Car destroy.....");
    }
}
