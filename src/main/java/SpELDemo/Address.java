package SpELDemo;

/**
 * Copyright (C)，XX
 * FileName: Address
 * Author: zl
 * Date: 2018/12/2  18:11
 * Description: spring自动装配
 **/
public class Address {
    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
