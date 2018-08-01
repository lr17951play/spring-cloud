package com.lirui.cloud.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudAuthorizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAuthorizationApplication.class, args);
    }
}
