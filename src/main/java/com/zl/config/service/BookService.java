package com.zl.config.service;

import com.zl.config.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Copyright (C)，XX
 * FileName: BookService
 * Author: zl
 * Date: 2018/12/15  16:55
 * Description:
 **/
@Service
public class BookService {

    @Autowired
//    @Qualifier("bookDao")//通过byName来自动注入
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
