package com.ice.eurekaconsumerfeignhystrix.controller;

import com.ice.eurekaconsumerfeignhystrix.service.FeignHystrixService;
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

    @GetMapping("/consumer/feign-hystrix")
    public String hystrixConsumer(){
        return feignHystrixService.consumer_feign_hystrix();
    }
}
