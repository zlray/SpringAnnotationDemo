package SpringBeanAutowire;


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
    private Address address;

    public Person() {

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", address=" + address +
                '}';
    }
}
