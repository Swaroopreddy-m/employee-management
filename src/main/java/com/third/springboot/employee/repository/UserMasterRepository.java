package com.third.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.third.springboot.employee.entity.UserMaster;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, String> {

<<<<<<< HEAD
    // Optional: find by systemUserId
    UserMaster findBySystemUserId(String systemUserId);

    // Optional: find by userName
    UserMaster findByUserName(String userName);
}
=======
}
>>>>>>> 862f1b99b1ef1ced8e7ab519332f328e0bcad9f1
