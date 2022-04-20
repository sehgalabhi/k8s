package com.example.demo;

import com.example.demo.config.MyConfig;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ScheduledBean {

    private MyConfig myConfig;

    @Scheduled(fixedDelay = 5000)
    public void hello() {
        System.out.println("The message is: " + myConfig.getMessage());
        System.out.println("The signal is: " + myConfig.getSignal());
        System.out.println("The password1 is: " + myConfig.getTestpassword1());
        System.out.println("The password2 is: " + myConfig.getTestpassword2());


    }
}
