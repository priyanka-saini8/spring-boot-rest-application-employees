package com.example.employeeCRUDApp.service;

import com.example.employeeCRUDApp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAl();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
