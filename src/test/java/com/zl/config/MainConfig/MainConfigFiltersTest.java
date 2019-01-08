package com.zl.config.MainConfig;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainConfigFiltersTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigFilters.class);
        String[] DefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : DefinitionNames) {
            System.out.println(name);
        }
    }

}