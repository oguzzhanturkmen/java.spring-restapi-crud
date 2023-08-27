package com.employeeapi.springboot.cruddemo.service;

import com.employeeapi.springboot.cruddemo.dao.EmployeeDAO;
import com.employeeapi.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;
    @Autowired

    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }
    @Transactional
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
    @Transactional
    @Override
    public Employee findById(int theId) {
        return  employeeDAO.findById(theId);

    }
    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
