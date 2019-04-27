package com.ice.eurekaconsumerribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Ice-winters
 * @Date: 2019/4/20 16:33
 * @Description:
 */
@Service
public class HystrixService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "consumerError")
    public String consumer() {
        String result = restTemplate.getForObject("http://eureka-client/provider/dc", String.class);
        System.out.println("result = " + result);
        return result;
    }



    public String consumerError(){
        return "There is one error happened!";
    }

}
