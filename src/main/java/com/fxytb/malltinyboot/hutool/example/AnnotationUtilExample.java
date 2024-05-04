package com.fxytb.malltinyboot.hutool.example;

import cn.hutool.core.annotation.AnnotationUtil;
import com.fxytb.malltinyboot.MallTinyBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.Annotation;

public class AnnotationUtilExample {
    public static void main(String[] args) {

        //获取指定类、方法、字段、构造器上的注解列表
        Annotation[] annotationList = AnnotationUtil.getAnnotations(MallTinyBootApplication.class, true);
        for (Annotation annotation : annotationList) {
//            System.out.println(annotation.annotationType());
        }
        //获取指定类型注解
        SpringBootApplication annotation = AnnotationUtil.getAnnotation(MallTinyBootApplication.class, SpringBootApplication.class);
    }
}
