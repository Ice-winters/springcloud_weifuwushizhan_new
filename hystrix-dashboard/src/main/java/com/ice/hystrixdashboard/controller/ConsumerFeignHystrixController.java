package com.ice.hystrixdashboard.controller;

import com.ice.hystrixdashboard.service.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/22 11:08
 * @Description:
 */
@RestController
public class ConsumerFeignHystrixController {
    @Autowired
    private FeignHystrixService feignHystrixService;

    @GetMapping("/consumer/hystrix-dashboard")
    public String hystrixConsumer(){
        return feignHystrixService.consumer_feign_hystrix();
    }
}
