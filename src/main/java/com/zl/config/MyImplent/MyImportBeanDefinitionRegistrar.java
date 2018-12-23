package com.zl.config.MyImplent;

import com.zl.config.ImportBean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Copyright (C)，XX
 * FileName: MyImportBeanDefinitionRegistrar
 * Author: zl
 * Date: 2018/12/16  21:38
 * Description: @ImportBeanDefinitionRegistrar测试类
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata  当前类的注解信息
     * @param registry BeanDefinitionRegistry的注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean defination1 = registry.containsBeanDefinition("com.zl.config.ImportBean.Red");
        boolean defination2 = registry.containsBeanDefinition("com.zl.config.ImportBean.Blue");

        //制定Bean的定义信息
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
        if (defination1 && defination2){
            //指定Bean名,注册一个Bean
            registry.registerBeanDefinition("rainbow",rootBeanDefinition);
        }
    }
}
