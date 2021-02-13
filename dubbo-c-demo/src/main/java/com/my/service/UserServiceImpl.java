package com.my.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Reference(version = "1.0.0")
    private UserDubboDemo userDemo;

    @Override
    public String getName() {
        return userDemo.getMessage();
    }
}
