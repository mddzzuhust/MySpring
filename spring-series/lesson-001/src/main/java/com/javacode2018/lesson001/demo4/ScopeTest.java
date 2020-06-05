package com.javacode2018.lesson001.demo4;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    ClassPathXmlApplicationContext context;

    @Before
    public void before(){
        System.out.println("spring容器准备启动.....");
        String beanXml = "classpath:/com/javacode2018/lesson001/demo4/beans.xml";
        this.context = new ClassPathXmlApplicationContext(beanXml);
        System.out.println("spring容器启动完毕！");
    }

    @Test
    public void singletonBean(){
        System.out.println("---------单例bean，每次获取的bean实例都一样---------");
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
    }

    /**
     * 多例bean
     */
    @Test
    public void prototypeBean() {
        System.out.println("---------单例bean，每次获取的bean实例都一样---------");
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
    }
}
