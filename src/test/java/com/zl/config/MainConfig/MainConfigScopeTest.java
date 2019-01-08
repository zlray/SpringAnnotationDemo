package com.zl.config.MainConfig;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainConfigScopeTest {

    @Test
    public void test2() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigScope.class);

        System.out.println("ioc  容器创建完成");
        String[] DefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : DefinitionNames) {
            System.out.println(name);
        }

        Object personDao = applicationContext.getBean("PersonDao");
        Object personDao2 = applicationContext.getBean("PersonDao");
        System.out.println(personDao == personDao2);
    }

}