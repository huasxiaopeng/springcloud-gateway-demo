package com.example.orderproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderProducerApplication.class, args);
    }

}
