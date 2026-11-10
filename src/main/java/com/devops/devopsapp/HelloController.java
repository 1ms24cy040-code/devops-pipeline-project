
package com.devops.devopsapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to DevOps CI/CD Project!";
    }

    @GetMapping("/info")
    public String info() {
        return "Application: DevOps REST API | Version: 1.0";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully!";
    }
}
