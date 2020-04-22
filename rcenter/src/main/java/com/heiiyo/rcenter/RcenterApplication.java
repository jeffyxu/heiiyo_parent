package com.heiiyo.rcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcenterApplication.class, args);
    }

}
