package com.javalei.consoulorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Consoulorder80Application {

    public static void main(String[] args) {
        SpringApplication.run(Consoulorder80Application.class, args);
    }

}
