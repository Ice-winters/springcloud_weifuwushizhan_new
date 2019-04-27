package com.ice.eurekaconsumerfeign.proxyinterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/18 14:20
 * @Description: 使用feign服务消费者
 */
@FeignClient(name = "eureka-client",path = "/provider")
public interface ProxyProviderService {

    @GetMapping("/dc")
    String consumer();
}
