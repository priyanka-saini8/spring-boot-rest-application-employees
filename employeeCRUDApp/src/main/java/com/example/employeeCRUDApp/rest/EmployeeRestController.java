package com.example.employeeCRUDApp.rest;

import com.example.employeeCRUDApp.dao.EmployeeDao;
import com.example.employeeCRUDApp.entity.Employee;
import com.example.employeeCRUDApp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){

        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null){
            throw new RuntimeException("Employee with id does not exist " + employeeId);
        }

        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){

        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){

        Employee tempEmployee = employeeService.findById(employeeId);

        if(tempEmployee == null){
            throw new RuntimeException("Employee not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Delete employee id - " + employeeId;
    }
}
