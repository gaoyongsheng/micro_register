package com.shopping.eureka.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingEurekaRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingEurekaRegisterApplication.class, args);
    }

}
