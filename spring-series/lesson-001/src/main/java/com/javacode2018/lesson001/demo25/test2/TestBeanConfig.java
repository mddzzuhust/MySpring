package com.javacode2018.lesson001.demo25.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnvConditional(EnvConditional.Env.TEST)//@1
public class TestBeanConfig {
    @Bean
    public String name() {
        return "我是测试环境!";
    }
}