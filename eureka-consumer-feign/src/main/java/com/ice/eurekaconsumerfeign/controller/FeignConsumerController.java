package com.ice.eurekaconsumerfeign.controller;

import com.ice.eurekaconsumerfeign.proxyinterface.ProxyProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/18 14:04
 * @Description:
 */
@RestController
public class FeignConsumerController {

    @Autowired
    private ProxyProviderService proxyProviderService;

    @GetMapping("/consumer-feign")
    public String consumerFeign(){
        return proxyProviderService.consumer();
    }

}
