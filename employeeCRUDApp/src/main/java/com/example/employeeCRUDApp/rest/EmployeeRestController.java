package com.example.employeeCRUDApp.rest;

import com.example.employeeCRUDApp.dao.EmployeeDao;
import com.example.employeeCRUDApp.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDao employeeDao;

    public EmployeeRestController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployee(){
        return employeeDao.findAll();
    }
}
