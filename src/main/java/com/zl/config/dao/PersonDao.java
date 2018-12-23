package com.zl.config.dao;

import org.springframework.beans.factory.annotation.Value;

/**
 * Copyright (C)，XX
 * FileName: Person
 * Author: zl
 * Date: 2018/12/16  12:30
 * Description:
 **/
public class PersonDao {

    @Value("张磊")
    private String name;

    //SpEL表达式
    @Value("#{20-2}")
    private int age;


    @Value("${personDao.nickname}")
    private String nickName;


    public PersonDao() {

        System.out.println("PersonDao  construct ......");

    }

    public PersonDao(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "PersonDao{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
