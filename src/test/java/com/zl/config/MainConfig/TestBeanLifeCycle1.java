package com.zl.config.MainConfig;

import com.zl.config.MainConfig.MainConfigLifeCycle1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Copyright (C)，XX
 * FileName: TestBeanLifeCycle
 * Author: zl
 * Date: 2018/12/17  21:10
 * Description: Bean的LifeCycle测试类
 **/

@ComponentScan(value = "com.zl.config")
public class TestBeanLifeCycle1 {

    @Test
    public void testLifeCycle(){
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigLifeCycle1.class);

        System.out.println("IOC 容器创建完成");

        //关闭容器
        applicationContext.close();
    }
}
