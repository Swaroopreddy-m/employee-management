package com.third.springboot.employee.service;

import com.third.springboot.employee.entity.UserMaster;
import com.third.springboot.employee.entity.UserIdMapping;

import java.util.List;

public interface UserService {

    // Fetch all users
    List<UserMaster> getAllUsers();

    // Fetch a user by customer ID
    UserMaster getUserByCustomerId(String customerId);

    // Fetch a user by system user ID
    UserMaster getUserBySystemUserId(String systemUserId);

    // Fetch all login mappings for a system user
    List<UserIdMapping> getLoginMappings(String systemUserId);
}