package com.example.mvc.service;

import com.example.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}

