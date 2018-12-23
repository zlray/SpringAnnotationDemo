package com.zl.config.MainConfig;

import com.zl.config.dao.PersonDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

class MainConfigOfPropertyValueTest {

    @Test
    void personDao() {
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);

        printBeans(applicationContext);


        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");

        System.out.println(personDao);

        //通过环境标量获取
        ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
        String nickname = configurableEnvironment.getProperty("personDao.nickname");
        System.out.println("通过环境变量获取到的nickname：" + nickname);
    }

    private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }
}