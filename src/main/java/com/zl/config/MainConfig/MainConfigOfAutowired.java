package com.zl.config.MainConfig;

import com.zl.config.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * Copyright (C)，XX
 * FileName: MainConfigOfAutowired
 * Author: zl
 * Date: 2018/12/23  11:18
 * Description: @Autowired的配置类
 **/

@Configuration
@ComponentScan({"com.zl.config.controller","com.zl.config.service","com.zl.config.dao"})
public class MainConfigOfAutowired {

    @Bean("bookDao2")
    @Primary  //首先自动装配该Bean
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setName("zll");
        return bookDao;
    }
}
