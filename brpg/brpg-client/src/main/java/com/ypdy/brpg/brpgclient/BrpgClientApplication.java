package com.ypdy.brpg.brpgclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BrpgClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrpgClientApplication.class, args);
    }
}
