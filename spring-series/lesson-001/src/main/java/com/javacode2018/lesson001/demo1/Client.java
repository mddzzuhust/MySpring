package com.javacode2018.lesson001.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���ںţ�·�˼�Java������10���ǰ����P7����Java���㷨�����ݿⷽ��ļ����ɻ��������ü����ı����ˣ��ü��˹��ϸ����������!
 */
public class Client {

    public static void main(String[] args) {
        //1.bean�����ļ�λ��
        String beanXml = "classpath:/com/javacode2018/lesson001/demo1/bean.xml";

        //2.����ClassPathXmlApplicationContext������������ָ����Ҫ���ص�bean�����ļ�
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        //3.�������л�ȡ��Ҫ��bean
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        //4.ʹ�ö���
        helloWorld.say();
        

    }
}