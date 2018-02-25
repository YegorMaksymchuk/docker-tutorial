package com.company.dockerjar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hello {

    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "<h1>Java is The best programming technology in the world</h1>";
    }

}