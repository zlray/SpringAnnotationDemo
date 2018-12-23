package com.zl.config.MainConfig;

import com.zl.config.ImportBean.Color;
import com.zl.config.ImportBean.ColorFactoryBean;
import com.zl.config.ImportBean.Red;
import com.zl.config.MyImplent.MyImportBeanDefinitionRegistrar;
import com.zl.config.MyImplent.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Copyright (C)，XX
 * FileName: MainConfig
 * Author: zl
 * Date: 2018/12/15  14:55
 * Description: 配置类
 **/

@Configuration  //告诉spring这是一个 配置类
//自动扫描
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfigFactoryBean {

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
