package com.third.springboot.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_master")
public class UserMaster {

	@Id
    @Column(name = "customer_id")
    private String userId;


}

