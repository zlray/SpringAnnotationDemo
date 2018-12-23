package SpringBeanAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C)，XX
 * FileName: main_autowire
 * Author: zl
 * Date: 2018/12/2  18:35
 * Description: spring自动装配的主类
 **/
public class main_autowire {
    public static void main(String[] agrs) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring_config.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        person = (Person) applicationContext.getBean("person11");
        System.out.println("byName测试：" + person);

        //byType测试代码
//        person = (Person) applicationContext.getBean("person22");
        System.out.println("byType: " + person);
        System.out.println("bean配置的继承的测试");
        Address address = (Address) applicationContext.getBean("address3");
        System.out.println(address);
        address = (Address) applicationContext.getBean("address4");
        System.out.println(address);

        System.out.println("bean依赖的测试");
        person = (Person) applicationContext.getBean("personDepend");
        System.out.println(person);

    }
}
