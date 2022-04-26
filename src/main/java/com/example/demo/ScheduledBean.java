package com.example.demo;

import com.example.demo.config.MyConfigConfigurationProperties;
import com.example.demo.config.MyConfigRefreshScope;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
@Setter
public class ScheduledBean {

    private final MyConfigConfigurationProperties myConfigConfigurationProperties;
    private final MyConfigRefreshScope myConfigRefreshScope;


    @Scheduled(fixedDelay = 5000)
    public void hello() {
        System.out.println("The message is: " + myConfigConfigurationProperties.getMessage());
        System.out.println("The signal is: " + myConfigConfigurationProperties.getSignal());
        System.out.println("The password1 is: " + myConfigConfigurationProperties.getTestpassword1());
        System.out.println("The password2 is: " + myConfigConfigurationProperties.getTestpassword2());

        System.out.println("The message from value annotation is: " + myConfigRefreshScope.getMessageFromValueAnnotation());

    }


}
