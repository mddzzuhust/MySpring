package com.javacode2018.lesson001.demo25;

import com.javacode2018.lesson001.demo25.test1.IService;
import com.javacode2018.lesson001.demo25.test1.MainConfig1;
import com.javacode2018.lesson001.demo25.test2.DevBeanConfig;
import com.javacode2018.lesson001.demo25.test3.MainConfig3;
import com.javacode2018.lesson001.demo25.test4.MainConfig4;
import com.javacode2018.lesson001.demo25.test5.MainConfig5;
import com.javacode2018.lesson001.demo25.test6.MainConfig6;
import com.javacode2018.lesson001.demo25.test7.MainConfig7;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConditionTest {

    @Test
    public void test3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        Map<String, String> serviceMap = context.getBeansOfType(String.class);
        serviceMap.forEach((beanName, bean) -> {
            System.out.println(String.format("%s->%s", beanName, bean));
        });
    }

    @Test
    public void test4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        Map<String, String> serviceMap = context.getBeansOfType(String.class);
        serviceMap.forEach((beanName, bean) -> {
            System.out.println(String.format("%s->%s", beanName, bean));
        });
    }

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        Map<String, IService> serviceMap = context.getBeansOfType(IService.class);
        serviceMap.forEach((beanName, bean) -> {
            System.out.println(String.format("%s->%s", beanName, bean));
        });
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DevBeanConfig.class);
        System.out.println(context.getBean("name"));
    }

    @Test
    public void test5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
    }

    @Test
    public void test6() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
    }

    @Test
    public void test7() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig7.class);
        context.getBeansOfType(String.class).forEach((beanName, bean) -> {
            System.out.println(String.format("%s->%s", beanName, bean));
        });
    }
}