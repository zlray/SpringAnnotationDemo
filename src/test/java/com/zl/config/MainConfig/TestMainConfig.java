package com.zl.config.MainConfig;

import com.zl.config.ImportBean.Blue;
import com.zl.config.ImportBean.ColorFactoryBean;
import com.zl.config.MainConfig.MainConfigFactoryBean;
import com.zl.config.MainConfig.MainConfigImport;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (C)，XX
 * FileName: TestMainConfig
 * Author: zl
 * Date: 2018/12/15  16:58
 * Description: test类
 **/
public class TestMainConfig {
//    @Test
//    public void test() {
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(MainConfig.class);
//        String[] DefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : DefinitionNames) {
//            System.out.println(name);
//        }
//    }

//    @Test
//    public void test2() {
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(MainConfig2.class);
//
//        System.out.println("ioc  容器创建完成");
////        String[] DefinitionNames = applicationContext.getBeanDefinitionNames();
////        for (String name : DefinitionNames) {
////            System.out.println(name);
////        }
//
////        Object personDao = applicationContext.getBean("PersonDao");
////        Object personDao2 = applicationContext.getBean("PersonDao");
////        System.out.println(personDao == personDao2);
//    }

//    @Test
//    public void test3() {
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(MainConfig3.class);
//
//
//        System.out.println("ioc  容器创建完成");
//        String[] NamesForType = applicationContext.getBeanNamesForType(PersonDao.class);
//        for (String name : NamesForType) {
//            System.out.println("name  " + name);
//        }
//
//        ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
//        String property = configurableEnvironment.getProperty("os.name");
//        System.out.println("操作系统 : " + property);
//
//        Map<String, PersonDao> BeansOfType = applicationContext.getBeansOfType(PersonDao.class);
//        System.out.println(BeansOfType);
//    }

//    @Test
//    public void testImport() {
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(MainConfigImport.class);
//        printBeans(applicationContext);
//
//        //测试通过@ImportSelector是否在容器中添加了类
//        Blue blue = applicationContext.getBean(Blue.class);
//        System.out.println(blue);
//        System.out.println("ioc  容器创建完成");
//    }
//
//    private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
//        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }

    @Test
    public void testFactoryBean() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigFactoryBean.class);

        System.out.println("ioc  容器创建完成");

        printBeans(applicationContext);

        //FactoryBean获取的是调用 ColorFactoryBean中getObject的方法获取的对象
        Object bean1 = applicationContext.getBean("colorFactoryBean");
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("Bean的类型: " + bean1.getClass());
        //ColorFactoryBean中isSingleton为true则为单实例
        System.out.println(bean1 == bean2);

        //添加&的前缀,获取到ColorFactoryBean
        Object bean3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean3);
    }

    private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }
}
