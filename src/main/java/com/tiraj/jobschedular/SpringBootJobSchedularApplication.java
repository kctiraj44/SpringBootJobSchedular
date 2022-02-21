package com.tiraj.jobschedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootJobSchedularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJobSchedularApplication.class, args);
    }

}
