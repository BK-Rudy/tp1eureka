package com.infnet.sprcldtp1eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Sprcldtp1eurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sprcldtp1eurekaApplication.class, args);
    }

}
