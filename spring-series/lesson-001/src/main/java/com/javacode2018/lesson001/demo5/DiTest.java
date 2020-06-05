package com.javacode2018.lesson001.demo5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;

public class DiTest {
    @Test
    public void diByConstructorParamIndex(){
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diByConstructorParamIndex.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamIndex"));
    }

    @Test
    public void diByContructorParamType(){
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diByConstructorParamType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamType"));
    }

    @Test
    public void diByContructorParamName(){
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diByConstructorParamName.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamName"));
    }

    @Test
    public void diBySetter() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diBySetter.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBySetter"));
    }

    @Test
    public void diBean(){
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBeanByConstructor"));
        System.out.println(context.getBean("diBeanBySetter"));
    }

    @Test
    public void diOtherType() {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo5/diOtherType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diOtherType"));
    }

    @Test
    public void isAssignableFrom(){
        System.out.println(Object.class.isAssignableFrom(Integer.class)); //true
        System.out.println(Object.class.isAssignableFrom(int.class)); //false
        System.out.println(Object.class.isAssignableFrom(List.class)); //true
        System.out.println(Collection.class.isAssignableFrom(List.class)); //true
        System.out.println(List.class.isAssignableFrom(Collection.class)); //false
    }
}
