package com.javacode2018.lesson001.demo3;

import org.springframework.lang.Nullable;

public interface FactoryBean<T> {

    @Nullable
    T getObject() throws Exception;

    @Nullable
    Class<?> getObjectType();

    default boolean isSingleton(){
        return true;
    }
}
