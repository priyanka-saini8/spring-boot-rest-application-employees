package com.example.employeeCRUDApp.rest;

import com.example.employeeCRUDApp.dao.EmployeeDao;
import com.example.employeeCRUDApp.entity.Employee;
import com.example.employeeCRUDApp.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployee(){
        return employeeService.findAl();
    }
}
