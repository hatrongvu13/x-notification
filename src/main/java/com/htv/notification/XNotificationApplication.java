package com.htv.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class XNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(XNotificationApplication.class, args);
    }

}
