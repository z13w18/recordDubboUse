package com.my.service.impl;

import com.my.service.UserDubboDemo;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserDubboDemoImpl implements UserDubboDemo {
    public String getMessage() {
        return "hello dubbo";
    }
}
