package com.apple.demo032302;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.apple.demo032302.mapper")//扫描mapper
public class Demo032302Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo032302Application.class, args);
    }

}
