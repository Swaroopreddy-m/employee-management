package com.third.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.third.springboot.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
