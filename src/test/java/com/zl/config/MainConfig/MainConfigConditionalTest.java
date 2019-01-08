package com.zl.config.MainConfig;


import com.zl.config.dao.PersonDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

class MainConfigConditionalTest {

    @Test
    public void test3() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigConditional.class);


        System.out.println("ioc  容器创建完成");
        String[] NamesForType = applicationContext.getBeanNamesForType(PersonDao.class);
        for (String name : NamesForType) {
            System.out.println("name  " + name);
        }

        ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
        String property = configurableEnvironment.getProperty("os.name");
        System.out.println("操作系统 : " + property);

        Map<String, PersonDao> BeansOfType = applicationContext.getBeansOfType(PersonDao.class);
        System.out.println(BeansOfType);
    }

}