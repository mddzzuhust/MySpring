package com.javacode2018.lesson001.demo3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        String beanXml = "classpath:/com/javacode2018/lesson001/demo3/beans.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        System.out.println("spring����������bean���£�");

        for (String beanName :context.getBeanDefinitionNames()){
            System.out.println(beanName+":"+context.getBean(beanName));
        }

        System.out.println("--------------------------");

        System.out.println();
        //��λ�ȡcreateByFactoryBean�����Ƿ���ͬһ������
        System.out.println("createByFactoryBean:" + context.getBean("createByFactoryBean"));
        System.out.println("createByFactoryBean:" + context.getBean("createByFactoryBean"));
    }
}
