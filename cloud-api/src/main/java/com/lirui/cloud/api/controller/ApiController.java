package com.lirui.cloud.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Value("${cloud.api.env}")
    private String env;

    @GetMapping("/hello")
    public String hello () {
        return "This is Api Service and running env is: " + this.env;
    }
}
