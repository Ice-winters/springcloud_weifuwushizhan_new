package com.ice.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableDiscoveryClient(autoRegister = false)
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @RestController
    public class DciController{

        @Autowired
        private DiscoveryClient discoveryClient;

        @GetMapping("/provider/info")
        public String showDetail(){
            String description = discoveryClient.description();
            String detail = discoveryClient.getServices().stream().reduce((s, s2) -> s.concat(", " + s2)).orElse("未发现服务");
            return "detail: "+detail+"\ndescription: "+description;
        }
    }

}
