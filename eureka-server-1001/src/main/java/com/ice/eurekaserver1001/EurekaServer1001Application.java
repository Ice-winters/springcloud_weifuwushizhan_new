package com.ice.eurekaserver1001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer1001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1001Application.class, args);
    }

}
