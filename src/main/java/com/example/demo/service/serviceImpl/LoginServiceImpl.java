package com.example.demo.service.serviceImpl;

import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    @Override
    public String test() {
        return "hello : spring boot";
    }
}
