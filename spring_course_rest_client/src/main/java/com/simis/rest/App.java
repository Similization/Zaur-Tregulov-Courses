package com.simis.rest;

import com.simis.rest.configuration.MyConfiguration;
import com.simis.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfiguration.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> employeeList = communication.getAllEmployees();
//        System.out.println(employeeList);

//        Employee employee = communication.getEmployee(10);
//        System.out.println(employee);

//        Employee newEmployee = new Employee(0, "Alex", "lesha4ok@mail.ru", "Ty78Gr_");
//        communication.saveEmployee(newEmployee);

//        employee.setName("Met");
//        communication.saveEmployee(employee);

        communication.deleteEmployee(11);
    }
}
