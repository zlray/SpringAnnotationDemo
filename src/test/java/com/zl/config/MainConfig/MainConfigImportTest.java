package com.zl.config.MainConfig;

import com.zl.config.ImportBean.Blue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainConfigImportTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testImport() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigImport.class);
        printBeans(applicationContext);

        //测试通过@ImportSelector是否在容器中添加了类
        Blue blue = applicationContext.getBean(Blue.class);
        System.out.println("测试通过@ImportSelector是否在容器中添加了类: " + blue);
        System.out.println("ioc  容器创建完成");
    }

    private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }
}