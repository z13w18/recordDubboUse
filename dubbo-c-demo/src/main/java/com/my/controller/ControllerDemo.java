package com.my.controller;

import com.my.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerDemo {

//    @Reference(version = "1.0.0")
//    private UserDemo userDemo;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "hello/dubbo", method = RequestMethod.GET)
    public String test() {
//        String message = userDemo.getMessage();

//        if (message != null && message.length() > 0) {
//            return "没有数据";
//        }

        String name = userService.getName();

        if (name == null || name.length() <= 0) {
            return "获取不到数据";
        }

        return "message";
    }

}
