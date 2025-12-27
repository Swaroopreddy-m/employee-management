package com.third.springboot.employee.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.third.springboot.employee.entity.Employee;
import com.third.springboot.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}

