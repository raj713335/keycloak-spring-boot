package com.example.keycloak_spring_boot;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "Hello from SpringBoot & Keycloak";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('client_user')")
    public String hello2() {
        return "Hello from SpringBoot & Keycloak - ADMIN";
    }
}
