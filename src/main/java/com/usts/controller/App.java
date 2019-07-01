package com.usts.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lenovo on 2019/6/18.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.usts.*"})
@MapperScan("com.usts.mapper")
public class App{

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
