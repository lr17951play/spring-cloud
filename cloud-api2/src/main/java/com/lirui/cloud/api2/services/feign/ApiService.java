package com.lirui.cloud.api2.services.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("api-server")
public interface ApiService {

    @RequestMapping("/api/hello")
    String helloApi();
}
