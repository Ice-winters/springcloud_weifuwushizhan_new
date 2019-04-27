package com.ice.eurekaconsumerribbonhystrix.controller;

import com.ice.eurekaconsumerribbonhystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/20 16:30
 * @Description:
 */
@RestController
public class HystrixRibbonConsumerController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/consumer/ribbon-hystrix")
    public String hystrixConsumer(){
        return hystrixService.consumer();
    }


}
