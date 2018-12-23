package SpringBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C)，XX
 * FileName: MainScope
 * Author: zl
 * Date: 2018/12/2  21:50
 * Description:
 **/
public class MainScope {
    public static void main(String[] agrs) {
        //创建容器
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans_scope.xml");

        Dog dog1 = (Dog) applicationContext.getBean("dog");
        System.out.println(dog1);
        Dog dog2 = (Dog) applicationContext.getBean("dog");
        System.out.println(dog2);
        System.out.println(dog1 == dog2);
    }
}
