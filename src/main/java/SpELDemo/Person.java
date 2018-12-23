package SpELDemo;

/**
 * Copyright (C)，XX
 * FileName: Person
 * Author: zl
 * Date: 2018/11/27  22:34
 * Description:
 **/
public class Person {
    private String name;
    private Car car;
    //引用address的city属性
    private String city;
    //根据car的price确定info car的price>=300000
    private String info;
    public Person() {

    }

    public Person(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
