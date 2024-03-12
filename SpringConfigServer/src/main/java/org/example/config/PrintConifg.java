package org.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Describe
 * @Author zem
 * @CreateDate 2024/3/12 0012 15:01
 */
@Component
public class PrintConifg implements CommandLineRunner {
    
    @Value("${env.tag}")
    private String profileEnv;
    
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println(profileEnv);
    }
}
