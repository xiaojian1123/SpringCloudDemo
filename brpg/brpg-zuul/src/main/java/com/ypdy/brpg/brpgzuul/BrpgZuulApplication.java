package com.ypdy.brpg.brpgzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class BrpgZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrpgZuulApplication.class, args);
    }
}
