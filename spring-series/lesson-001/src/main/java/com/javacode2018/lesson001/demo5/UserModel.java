package com.javacode2018.lesson001.demo5;

public class UserModel {
    private String name;
    private int age;

    private String desc;

    public UserModel(){

    }

    public UserModel(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public UserModel(String name,int aget,String desc){
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
