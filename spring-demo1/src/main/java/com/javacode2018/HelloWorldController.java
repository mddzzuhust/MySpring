package com.javacode2018;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求URL:http://localhost:8080/helloWorld/index
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @RequestMapping("/index")
    public String index() {
        return "hello world!";
    }
}
