package com.example.demo.controller;

import com.example.demo.service.serviceImpl.LoginServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
public class LoginController {
    @Resource
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping("/go")
    public String test(){
        return loginServiceImpl.test();
    }

}
