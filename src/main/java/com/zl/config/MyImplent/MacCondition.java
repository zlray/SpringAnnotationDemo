package com.zl.config.MyImplent;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Copyright (C)，XX
 * FileName: MacCondation
 * Author: zl
 * Date: 2018/12/16  13:51
 * Description:
 **/
public class MacCondition implements Condition {

    // ConditionContext 判断条件能使用的上下文
    //AnnotatedTypeMetadata 标注了@Condition注解的注释信息
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //能获取到ioc使用的bean factory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取环境的信息
        Environment environment = context.getEnvironment();
        //获取到bean定义的注册类
        BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();

        String property = environment.getProperty("os.name");
        if (property.contains("Mac")) {
            return true;
        }
        return false;
    }
}
