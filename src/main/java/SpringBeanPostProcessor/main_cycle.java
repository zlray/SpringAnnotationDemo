package SpringBeanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C)，XX
 * FileName: main_cycle
 * Author: zl
 * Date: 2018/12/4  21:06
 * Description: bean的生命周期的主类
 **/
public class main_cycle {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans_cycle.xml");
        Car car = (Car) applicationContext.getBean("cycle_car");
        System.out.println(car);
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
