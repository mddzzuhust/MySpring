package com.javacode2018.lesson001.demo18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* @Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Ann12{} */

@Ann12(name = "路人甲Java")
@Ann12(name = "Spring系列")
public class UseAnnotation12 {
    @Ann12s(
            {@Ann12(name = "Java高并发系列，见公众号"),
                    @Ann12(name = "mysql高手系列，见公众号")}
    )
    private String v1;
}