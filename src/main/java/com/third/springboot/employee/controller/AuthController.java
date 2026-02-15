package com.third.springboot.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.third.springboot.employee.service.AuthService;
import com.third.springboot.employee.dto.LoginRequest;
import com.third.springboot.employee.dto.LoginResponse;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        boolean isValid = authService.authenticate(request.getUserId(), request.getPassword());

        if (isValid) {
            return ResponseEntity.ok(new LoginResponse("LOGIN_SUCCESS"));
        }

        return ResponseEntity.status(401).body(new LoginResponse("INVALID_CREDENTIALS"));
    }
}