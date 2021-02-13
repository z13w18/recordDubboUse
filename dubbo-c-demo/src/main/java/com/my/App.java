package com.my;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.my.controller",
                "com.my.service"})
@EnableDubbo
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("spring boot 启动，dubbo 消费者");
    }
}
