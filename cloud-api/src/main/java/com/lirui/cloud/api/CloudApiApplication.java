package com.lirui.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApiApplication.class, args);
    }
}
