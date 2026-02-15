package com.third.springboot.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.third.springboot.employee.service.AuthService;
<<<<<<< HEAD
import com.third.springboot.employee.dto.LoginRequest;
import com.third.springboot.employee.dto.LoginResponse;
=======


>>>>>>> 862f1b99b1ef1ced8e7ab519332f328e0bcad9f1

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
<<<<<<< HEAD
        boolean isValid = authService.authenticate(request.getUserId(), request.getPassword());
=======

        boolean isValid = authService.authenticate(
                request.getUserId(),
                request.getPassword()
        );
>>>>>>> 862f1b99b1ef1ced8e7ab519332f328e0bcad9f1

        if (isValid) {
            return ResponseEntity.ok(new LoginResponse("LOGIN_SUCCESS"));
        }

<<<<<<< HEAD
        return ResponseEntity.status(401).body(new LoginResponse("INVALID_CREDENTIALS"));
    }
=======
        return ResponseEntity
                .status(401)
                .body(new LoginResponse("INVALID_CREDENTIALS"));
    }
}


//Simple response DTO
class LoginResponse {
 private String status;

 public LoginResponse(String status) { this.status = status; }
 public String getStatus() { return status; }
 public void setStatus(String status) { this.status = status; }
>>>>>>> 862f1b99b1ef1ced8e7ab519332f328e0bcad9f1
}