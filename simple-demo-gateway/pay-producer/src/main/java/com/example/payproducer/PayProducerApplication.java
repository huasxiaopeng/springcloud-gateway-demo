package com.example.payproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PayProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayProducerApplication.class, args);
    }

}
