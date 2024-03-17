package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe
 * @Author zem
 * @CreateDate 2024/3/13 0013 15:06
 */
@Component
@RestController
@RefreshScope
public class Configshow implements CommandLineRunner {
    @Value("${env.tag}")
    private String env;
    
    @Value("${envTag}")
    private String name;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println(env);
        System.out.println(name);
    }

    @Value("${profile}")
    private String profile;

    @GetMapping("/")
    public String home() {
        return profile;
    }
}
