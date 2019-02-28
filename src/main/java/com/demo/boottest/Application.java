package com.demo.boottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        String hostName=System.getenv("HOSTNAME");
        return "Hello from Spring Boot S2I from "+hostName;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
