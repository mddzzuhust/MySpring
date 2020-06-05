package com.javacode2018.lesson001.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * ���ںţ�·�˼�Java������10���ǰ����P7����Java���㷨�����ݿⷽ��ļ����ɻ��������ü����ı����ˣ��ü��˹��ϸ����������!
 */
public class Client {

    public static void main(String[] args) {
        //1.bean�����ļ�λ��
        String beanXml = "classpath:/com/javacode2018/lesson001/demo2/bean.xml";

        //2.����ClassPathXmlApplicationContext������������ָ����Ҫ���ص�bean�����ļ�
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        for (String beanName : Arrays.asList("user1", "user2", "user3", "user4", "user5")) {
            //��ȡbean�ı���
            String[] aliases = context.getAliases(beanName);
            System.out.println(String.format("beanName:%s,����:[%s]", beanName, String.join(",", aliases)));
        }

        System.out.println("spring����������bean���£�");

        //getBeanDefinitionNames���ڻ�ȡ����������bean������
        for (String beanName : context.getBeanDefinitionNames()) {
            //��ȡbean�ı���
            String[] aliases = context.getAliases(beanName);
            System.out.println(String.format("beanName:%s,����:[%s]", beanName, String.join(",", aliases)));
        }

    }
}