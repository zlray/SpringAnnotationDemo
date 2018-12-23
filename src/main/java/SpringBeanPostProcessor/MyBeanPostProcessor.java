package SpringBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Copyright (C)，XX
 * FileName: MyBeanPostProcessor
 * Author: zl
 * Date: 2018/12/4  21:15
 * Description: Bean的后置处理器
 **/

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization: " + bean + ", " + beanName);
        return beanName;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization: " + bean + ", " + beanName);
        return beanName;
    }
}
