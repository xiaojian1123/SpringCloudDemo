package com.ypdy.brpg.brpgconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class BrpgConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrpgConfigApplication.class, args);
    }
}
