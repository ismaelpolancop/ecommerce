package com.ecommerce.auth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "Login endpoint for Keycloak integration";
    }

    @GetMapping("/logout")
    public String logout() {
        return "Logout endpoint for Keycloak integration";
    }

    @GetMapping("/user")
    public String getUserInfo() {
        return "User info endpoint for Keycloak integration";
    }
}