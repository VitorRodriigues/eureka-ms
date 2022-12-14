package com.accountmng.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountMngMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountMngMsApplication.class, args);
    }

}
