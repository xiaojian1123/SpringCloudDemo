package com.ypdy.brpg.brpgeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BrpgEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrpgEurekaApplication.class, args);
    }
}
