package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsdemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello from Jenkins + Spring Boot!";
    }
}

