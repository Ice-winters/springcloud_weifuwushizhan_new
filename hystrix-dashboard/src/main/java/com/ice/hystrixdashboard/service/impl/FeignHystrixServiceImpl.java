package com.ice.hystrixdashboard.service.impl;

import com.ice.hystrixdashboard.service.FeignHystrixService;
import org.springframework.stereotype.Service;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/22 11:15
 * @Description:
 */
@Service("feignHystrixService")
public class FeignHystrixServiceImpl implements FeignHystrixService {
    @Override
    public String consumer_feign_hystrix() {
        // when an error happened , this method will be called
        return "hystrix_dashboard  访问eureka-client服务出现异常，请联系管理员确实情况！";
    }

}
