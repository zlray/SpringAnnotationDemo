package com.zl.config.MainConfig;

import com.zl.config.MyImplent.MacCondition;
import com.zl.config.MyImplent.WindowsCondition;
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
public class MainConfig3 {

    @Conditional({WindowsCondition.class})
    @Bean("windows")
    public PersonDao personDao1(){
        return new PersonDao("windows");
    }

    @Conditional({MacCondition.class})
    @Bean("mac")
    public PersonDao personDao2(){
        return new PersonDao("mac");
    }
}
