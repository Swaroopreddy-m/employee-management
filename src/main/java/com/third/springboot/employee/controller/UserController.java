package com.third.springboot.employee.controller;

import com.third.springboot.employee.entity.UserMaster;
import com.third.springboot.employee.entity.UserIdMapping;
import com.third.springboot.employee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserMaster> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{systemUserId}")
    public UserMaster getUser(@PathVariable String systemUserId) {
        return userService.getUserBySystemUserId(systemUserId);
    }

    @GetMapping("/{systemUserId}/logins")
    public List<UserIdMapping> getLoginMappings(@PathVariable String systemUserId) {
        return userService.getLoginMappings(systemUserId);
    }
}