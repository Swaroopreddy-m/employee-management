package com.third.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.third.springboot.employee.entity.UserMaster;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, String> {

}
