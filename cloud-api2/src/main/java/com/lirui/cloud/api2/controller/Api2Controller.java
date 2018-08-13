package com.lirui.cloud.api2.controller;

import com.lirui.cloud.api2.services.feign.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class Api2Controller {

    @Autowired
    private ApiService apiService;

    @Value("${cloud.api.env}")
    private String env;

    @GetMapping("/hello")
    public String hello () {
        return "This is Api2 Service and running env is: " + this.env;
    }

    @GetMapping("helloApi")
    public String helloApi() {
        return apiService.helloApi();
    }
}
