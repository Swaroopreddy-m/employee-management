package com.third.springboot.employee.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.third.springboot.employee.entity.PinMaster;

@Repository
public interface PinMasterRepository extends JpaRepository<PinMaster, String> {

    Optional<PinMaster> findByUserId(String userId);
}
