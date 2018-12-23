package com.zl.config.MyImplent;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Copyright (C)，XX
 * FileName: MyImportSelector
 * Author: zl
 * Date: 2018/12/16  21:13
 * Description: @ImportSelector
 **/

//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    //返回值就是导入容器中的组件的全类名
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //不能返回null
        return new String[]{"com.zl.config.ImportBean.Blue"};
    }
}
