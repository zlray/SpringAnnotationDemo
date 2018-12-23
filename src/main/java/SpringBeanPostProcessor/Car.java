package SpringBeanPostProcessor;

/**
 * Copyright (C)，XX
 * FileName: Car
 * Author: zl
 * Date: 2018/12/4  21:02
 * Description: beans的生命周期 lifecycle
 **/
public class Car {
    private String name;

    public Car() {
        System.out.println("Car's constructor.....");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Car's setName.....");
        this.name = name;
    }

    public void init() {
        System.out.println("Car's init.....");
    }

    public void destroy() {
        System.out.println("Car's destroy.....");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
