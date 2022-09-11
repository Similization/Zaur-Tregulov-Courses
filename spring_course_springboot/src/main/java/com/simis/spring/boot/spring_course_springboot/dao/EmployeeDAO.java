package com.simis.spring.boot.spring_course_springboot.dao;

import com.simis.spring.boot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}
