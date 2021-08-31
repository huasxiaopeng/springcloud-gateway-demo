package com.example.smsproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SmsProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsProducerApplication.class, args);
    }

}
