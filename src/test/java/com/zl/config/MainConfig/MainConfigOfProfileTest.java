package com.zl.config.MainConfig;

import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainConfigOfProfileTest {

    @Test
    public void test() {
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        //设置好环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        //注册配置类
        applicationContext.register(MainConfigOfProfile.class);
        //刷新
        applicationContext.refresh();


        String[] NamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : NamesForType) {
            System.out.println("name  " + name);
        }
    }
}