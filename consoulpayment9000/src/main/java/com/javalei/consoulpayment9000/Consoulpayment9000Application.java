package com.javalei.consoulpayment9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Consoulpayment9000Application {

    public static void main(String[] args) {
        SpringApplication.run(Consoulpayment9000Application.class, args);
    }

}
