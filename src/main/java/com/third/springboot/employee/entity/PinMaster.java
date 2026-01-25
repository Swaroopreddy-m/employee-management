package com.third.springboot.employee.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "pin_master")
public class PinMaster {

    @Id
    @Column(name = "CUSTOMER_ID")
    private String userId;

    @Column(name = "CUSTOMER_PASSWORD")
    private String password;

    @Column(name = "SYSTEM_USER_ID")
    private String systemId;

    // ✅ CORRECT getters & setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
