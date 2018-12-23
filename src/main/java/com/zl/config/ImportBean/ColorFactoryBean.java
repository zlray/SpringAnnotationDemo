package com.zl.config.ImportBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Copyright (C)，XX
 * FileName: ColorFactory
 * Author: zl
 * Date: 2018/12/16  21:59
 * Description: BeanFactory的测试类
 **/
public class ColorFactoryBean implements FactoryBean<Color> {

    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //控制是否时单利
    //true 在容器中保存一份Bean的实例
    //false 每次获取都会创建一个新的Bean实例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
