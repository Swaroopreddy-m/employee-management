package com.third.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.third.springboot.employee.entity.UserIdMapping;

import java.util.List;

@Repository
public interface UserIdMappingRepository extends JpaRepository<UserIdMapping, Long> {

    // Find all mappings for a given system user
    List<UserIdMapping> findBySystemUserId(String systemUserId);

    // Find mapping by login user ID
    UserIdMapping findByLoginUserId(String loginUserId);
}