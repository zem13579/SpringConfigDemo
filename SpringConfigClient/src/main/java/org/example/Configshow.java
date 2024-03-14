package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Describe
 * @Author zem
 * @CreateDate 2024/3/13 0013 15:06
 */
@Component
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
}
