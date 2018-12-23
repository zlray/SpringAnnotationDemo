package SpringBeanScope;

/**
 * Copyright (C)，XX
 * FileName: Animals
 * Author: zl
 * Date: 2018/12/2  21:46
 * Description: spring作用域描述
 **/
public class Animals {
    private String type;
    Dog dog;

    public Animals() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
