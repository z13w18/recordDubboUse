package com.my;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class AppP {

    public static void main(String[] args) {
        SpringApplication.run(AppP.class, args);
        System.out.println("spring boot 启动，dubbo 提供者注册成功");
    }

}
