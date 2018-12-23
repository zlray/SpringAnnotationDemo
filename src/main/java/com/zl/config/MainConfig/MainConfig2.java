package com.zl.config.MainConfig;

import com.zl.config.MyImplent.MacCondition;
import com.zl.config.dao.PersonDao;
import org.springframework.context.annotation.*;

/**
 * Copyright (C)，XX
 * FileName: MainConfig
 * Author: zl
 * Date: 2018/12/15  14:55
 * Description: 配置类
 **/

@Configuration  //告诉spring这是一个 配置类
//自动扫描
@ComponentScans(value = {@ComponentScan(value = "com.zl.config")})
@Conditional(MacCondition.class) //当满足这个条件,这个类中配置的所有的Bean注册才能生效
public class MainConfig2 {

    //ConfigurableBeanFactory#SCOPE_PROTOTYPE  多实例
//ConfigurableBeanFactory#SCOPE_SINGLETON
    @Scope("prototype")
//    @Scope("singleton")
    @Lazy
    @Bean("PersonDao")
    public PersonDao personDao() {
        System.out.println("给容器添加personDao");
        return new PersonDao("zl");
    }
}
