package com.example.mvc.dao;

import com.example.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}
