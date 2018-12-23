package SpringBeanDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C)，XX
 * FileName: App
 * Author: zl
 * Date: 2018/11/27  21:59
 * Description: main方法
 **/
public class App {

    public static void main(String[] agrs) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");

        Car car = (Car) applicationContext.getBean("car1");
        System.out.println(car);

        car = (Car) applicationContext.getBean("car2");
        System.out.println(car);

        Person person = (Person) applicationContext.getBean("person1");
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getCar().getName());

        person = (Person) applicationContext.getBean("person2");
        System.out.println(person);
        System.out.println(person.getName());
        for (Car carzl : person.getCarList()) {
            System.out.println(carzl.getName() + "汽车");
        }
        NewPerson newPerson = (NewPerson) applicationContext.getBean("newperson");
        System.out.println("newPerson测试map属性:  " + newPerson);

        DataSource dataSource = (DataSource) applicationContext.getBean("datasource");
        System.out.println("dataSource测试properties属性:  " + dataSource);

        person = (Person) applicationContext.getBean("person3");
        System.out.println("测试独立的bean" + person);

        person = (Person) applicationContext.getBean("person4");
        System.out.println("测试p命名空间" + person);


    }
}
