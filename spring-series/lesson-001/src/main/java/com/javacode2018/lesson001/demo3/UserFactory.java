package com.javacode2018.lesson001.demo3;

public class UserFactory {
    public UserModel buildUser1(){
        System.out.println("----------------------1");
        UserModel userModel = new UserModel();
        userModel.setName("beanʵ�����������Ķ���");
        return userModel;
    }

    public UserModel buildUser2(String name,int age){
        System.out.println("----------------------2");
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}
