package SpELDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C)，XX
 * FileName: main_SpEL
 * Author: zl
 * Date: 2018/12/3  23:03
 * Description: SpEL主类
 **/
public class main_SpEL {

    public static void main(String[] agrs) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans_spel.xml");
        Address address = (Address) applicationContext.getBean("SpEL_address");
        System.out.println(address);

        Person person = (Person) applicationContext.getBean("SpEL_person");
        System.out.println(person);
    }
}
