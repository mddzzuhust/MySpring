package com.javacode2018.lesson001.demo3;

import org.springframework.lang.Nullable;

public class UserFactoryBean implements FactoryBean<UserModel>{
    int count = 1;
    @Nullable
    @Override
    public UserModel getObject() throws Exception{
        UserModel userModel = new UserModel();
        userModel.setName("����ͨ��FactoryBean�����ĵ�"+count+++ "����");
        return userModel;
    }

    @Nullable
    @Override
    public Class<?> getObjectType(){
        return UserModel.class;
    }

    @Override
    public boolean isSingleton(){
        return false;
    }
}
