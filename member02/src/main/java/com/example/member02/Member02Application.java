package com.example.member02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Member02Application {

    public static void main(String[] args) {
        SpringApplication.run(Member02Application.class, args);
    }

}
