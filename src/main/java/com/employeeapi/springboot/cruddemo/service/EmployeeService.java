package com.employeeapi.springboot.cruddemo.service;

import com.employeeapi.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int theId);

    Employee save(Employee employee);

    void deleteById(int theId);
}
