package SpringBeanExternalPropertyFile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Copyright (C)，XX
 * FileName: MainExternalPropertyFile
 * Author: zl
 * Date: 2018/12/2  22:39
 * Description: spring外部属性文件
 **/
public class MainExternalPropertyFile {
    public static void main(String[] agrs) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_properties.xml");
        DataSource dataSource = (ComboPooledDataSource) applicationContext.getBean("dataSource");
        try {
            System.out.println("连接" + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
