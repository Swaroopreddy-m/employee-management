package com.third.springboot.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.third.springboot.employee.entity.PinMaster;
import com.third.springboot.employee.repository.PinMasterRepository;
import com.third.springboot.employee.repository.UserMasterRepository;


@Service
public class AuthService {

    @Autowired
    private UserMasterRepository userMasterRepository;

    @Autowired
    private PinMasterRepository pinMasterRepository;

    public boolean authenticate(String userId, String password) {

        System.out.println("USER ID FROM UI => [" + userId + "]");
        System.out.println("PASSWORD FROM UI => [" + password + "]");

        // 1️⃣ Check user exists in user_master
        boolean userExists = userMasterRepository.existsById(userId);
        if (!userExists) {
            System.out.println("USER NOT FOUND IN user_master");
            return false;
        }

        // 2️⃣ Fetch password from pin_master
        Optional<PinMaster> pinOpt = pinMasterRepository.findByUserId(userId);

        if (pinOpt.isEmpty()) {
            System.out.println("NO RECORD IN pin_master");
            return false;
        }

        // 3️⃣ Compare password
        String dbPassword = pinOpt.get().getPassword();

        System.out.println("DB PASSWORD       => [" + dbPassword + "]");
        System.out.println("UI PASSWORD       => [" + password + "]");
        System.out.println("EQUALS RESULT     => " + dbPassword.equals(password));
        System.out.println("TRIMMED EQUALS    => " + dbPassword.trim().equals(password.trim()));

        // TEMP FIX (safe)
        return dbPassword != null &&
               dbPassword.trim().equals(password.trim());
    }
}
