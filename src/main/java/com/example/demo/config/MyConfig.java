package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
@Getter
@Setter
public class MyConfig {

//    @Value("${message}")
    private String message;

    private String signal;

    private String testpassword1;

    private String testpassword2;
}
