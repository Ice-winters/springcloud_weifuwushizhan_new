package com.ice.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/17 16:53
 * @Description:
 */
@RestController
public class RibbonConsumer {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer/dc")
    public String ribbonDc(){
//        eureka-client ribbon 回去解析 找到这个服务的IP和port来进行访问
        return restTemplate.getForObject("http://eureka-client/provider/dc", String.class);
    }


}
