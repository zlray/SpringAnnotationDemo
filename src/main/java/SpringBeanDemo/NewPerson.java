package SpringBeanDemo;

import java.util.Map;

/**
 * Copyright (C)，XX
 * FileName: NewPerson
 * Author: zl
 * Date: 2018/11/29  22:00
 * Description: spring的map属性
 **/
public class NewPerson {
    private String name;
    private Map<String, Car> carMap;

    public NewPerson(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", carMap=" + carMap +
                '}';
    }
}
