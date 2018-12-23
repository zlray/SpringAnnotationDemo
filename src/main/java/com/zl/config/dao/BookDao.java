package com.zl.config.dao;

import org.springframework.stereotype.Repository;
/**
 * Copyright (C)，XX
 * FileName: Book
 * Author: zl
 * Date: 2018/12/15  16:55
 * Description:
 **/
@Repository
//id默认为类名首字母小写的bookDao
public class BookDao {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "BookDao{" +
                "name='" + name + '\'' +
                '}';
    }
}
