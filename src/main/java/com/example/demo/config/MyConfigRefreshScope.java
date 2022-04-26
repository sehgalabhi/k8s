package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@RefreshScope
public class MyConfigRefreshScope {

    @Value("${value.message}")
    private String messageFromValueAnnotation;

}
