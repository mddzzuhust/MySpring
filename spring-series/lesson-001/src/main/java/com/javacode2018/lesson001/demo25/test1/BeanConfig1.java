package com.javacode2018.lesson001.demo25.test1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig1 {
    @Conditional(OnMissingBeanCondition.class) //@1
    @Bean
    public Service1 service1() {
        return new Service1();
    }
}