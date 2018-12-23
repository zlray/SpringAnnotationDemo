package SpELDemo;

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
    private double price;
    private int speed;

    public Car() {

    }

    public Car(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public Car(String name, String company, int speed) {
        this.name = name;
        this.company = company;
        this.speed = speed;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
