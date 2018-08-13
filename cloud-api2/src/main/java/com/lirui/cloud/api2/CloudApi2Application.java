package com.lirui.cloud.api2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CloudApi2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudApi2Application.class, args);
    }
}
