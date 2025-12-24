package com.javacode2018.lesson001.demo3;

public class UserStaticFactory {

    public static UserModel buildUser1(){
        System.out.println(UserStaticFactory.class + ".buildUser1()");

        UserModel userModel = new UserModel();
        userModel.setName("我是无参静态构造方法创建的！");
        return userModel;
    }

    public static UserModel buildUser2(String name, int age){
        System.out.println(UserStaticFactory.class + ".buildUser2()");

        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}
