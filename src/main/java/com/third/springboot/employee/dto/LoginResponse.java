package com.third.springboot.employee.dto;

public class LoginResponse {

    private String status;

    public LoginResponse() {} // default constructor for JSON deserialization

    public LoginResponse(String status) {
        this.status = status;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}