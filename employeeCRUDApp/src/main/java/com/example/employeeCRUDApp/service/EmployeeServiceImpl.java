package com.example.employeeCRUDApp.service;

import com.example.employeeCRUDApp.dao.EmployeeDao;
import com.example.employeeCRUDApp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAl() {
        return employeeDao.findAll();
    }
}
