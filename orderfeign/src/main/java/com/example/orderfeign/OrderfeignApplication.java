package com.example.orderfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.example.orderfeign.service")
public class OrderfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderfeignApplication.class, args);
    }

}
