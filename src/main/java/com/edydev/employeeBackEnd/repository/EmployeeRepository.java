package com.edydev.employeeBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edydev.employeeBackEnd.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
