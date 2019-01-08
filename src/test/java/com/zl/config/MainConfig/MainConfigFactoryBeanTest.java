package com.zl.config.MainConfig;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainConfigFactoryBeanTest {

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