package com.example.employeeCRUDApp.dao;

import com.example.employeeCRUDApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
