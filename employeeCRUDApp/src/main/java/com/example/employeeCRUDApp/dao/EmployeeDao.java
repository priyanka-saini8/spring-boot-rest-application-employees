package com.example.employeeCRUDApp.dao;

import com.example.employeeCRUDApp.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();
}
