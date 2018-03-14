package com.company;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RestDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestDemoApplication.class);
        log.info("RestDemoApplication successfully started");
    }
}
