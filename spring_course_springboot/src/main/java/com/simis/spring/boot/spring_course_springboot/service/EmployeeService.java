package com.simis.spring.boot.spring_course_springboot.service;

import com.simis.spring.boot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}
