package com.example.demo.cotroller;


import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
//请求URL：http://localhost:8080/login?userName=huitao&password=123456
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService service;

    @RequestMapping("login")
    public Admin page1(Admin admin) {
        return service.findByNameAndPassword(admin);
    }
}

