package com.zl.config.MainConfig;

import com.zl.config.dao.BookDao;
import com.zl.config.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainConfigOfAutowiredTest {

    @Test
    void personDao() {
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);

        System.out.println(bookService);

        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        System.out.println(bookDao);

    }

}