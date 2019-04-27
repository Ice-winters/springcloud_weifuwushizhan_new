package com.ice.hystrixdashboard.service;

import com.ice.hystrixdashboard.service.impl.FeignHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/22 11:13
 * @Description:
 */
@FeignClient(name = "eureka-client",fallback = FeignHystrixServiceImpl.class,path = "/provider")
public interface FeignHystrixService {

    @GetMapping("/dc")
    String consumer_feign_hystrix();



}
