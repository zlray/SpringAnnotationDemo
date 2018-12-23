package com.zl.config.controller;

import com.zl.config.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Copyright (C)，XX
 * FileName: BookControll
 * Author: zl
 * Date: 2018/12/15  16:55
 * Description:
 **/
@Controller
public class BookControll {

    @Autowired
    private BookDao bookDao;


}
