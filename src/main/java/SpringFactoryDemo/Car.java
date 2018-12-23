package SpringFactoryDemo;

/**
 * Copyright (C)，XX
 * FileName: Car
 * Author: zl
 * Date: 2018/11/27  22:11
 * Description: SpEL表达式
 **/
public class Car {

    private String name;
    private String company;

    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
