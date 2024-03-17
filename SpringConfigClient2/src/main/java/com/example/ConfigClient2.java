package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClient2 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2.class, args);
    }
}