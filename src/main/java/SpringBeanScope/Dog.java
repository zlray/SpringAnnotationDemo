package SpringBeanScope;

/**
 * Copyright (C)，XX
 * FileName: Dog
 * Author: zl
 * Date: 2018/12/2  21:46
 * Description:
 **/
public class Dog {
    private String name;
    private String sex;

    public Dog() {
        System.out.println("构造方法 construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
