package com.zl.config.MainConfig;

import com.zl.config.MyImplent.MyTypeFilter;
import org.springframework.context.annotation.*;

/**
 * Copyright (C)，XX
 * FileName: MainConfig
 * Author: zl
 * Date: 2018/12/15  14:55
 * Description: 配置类
 **/

@Configuration  //告诉spring这是一个 配置类
@ComponentScans(value = {@ComponentScan(value = "com.zl.config",
        includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookDao.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        },useDefaultFilters = false
)})
//@ComponentScan(value = "com.zl.config",
//        excludeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,
//                classes = {Controller.class, Service.class})}
// )


//@ComponentScan(value = "com.zl.config",
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
//                classes = {Controller.class})}, useDefaultFilters = false
//)

// Filter[]  excludeFilters  按照规则排除
// Filter[]  includeFilters  按照规则只包含
public class MainConfig {

}
