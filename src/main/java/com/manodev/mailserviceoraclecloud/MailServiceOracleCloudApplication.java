package com.manodev.mailserviceoraclecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MailServiceOracleCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailServiceOracleCloudApplication.class, args);
    }

}
