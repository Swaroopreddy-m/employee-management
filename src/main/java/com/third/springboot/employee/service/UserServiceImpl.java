package com.third.springboot.employee.service;

import com.third.springboot.employee.entity.UserMaster;
import com.third.springboot.employee.entity.UserIdMapping;
import com.third.springboot.employee.repository.UserMasterRepository;
import com.third.springboot.employee.repository.UserIdMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMasterRepository userMasterRepository;

    @Autowired
    private UserIdMappingRepository userIdMappingRepository;

    @Override
    public List<UserMaster> getAllUsers() {
        return userMasterRepository.findAll();
    }

    @Override
    public UserMaster getUserByCustomerId(String customerId) {
        return userMasterRepository.findById(customerId).orElse(null);
    }

    @Override
    public UserMaster getUserBySystemUserId(String systemUserId) {
        return userMasterRepository.findBySystemUserId(systemUserId);
    }

    @Override
    public List<UserIdMapping> getLoginMappings(String systemUserId) {
        return userIdMappingRepository.findBySystemUserId(systemUserId);
    }
}