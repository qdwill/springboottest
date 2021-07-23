package com.example.demo.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},scanBasePackages = {"com.example.demo.api","com.example.demo.core"})
@SpringBootApplication(scanBasePackages = {"com.example.demo.api","com.example.demo.core","com.example.demo.dao"})
public class DemoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiApplication.class, args);
    }

}
