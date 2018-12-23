package com.zl.config.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Copyright (C)，XX
 * FileName: Aircraft
 * Author: zl
 * Date: 2018/12/17  21:37
 * Description: 实现接口管理Bean的生命周期
 * <p>
 * InitializingBean初始化的接口，DisposableBean 销毁的接口
 **/
public class Aircraft implements InitializingBean, DisposableBean {

    public Aircraft(){
        System.out.println("Aircraft construct........");
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Aircraft destroy........");
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Aircraft afterPropertiesSet........");
    }
}
