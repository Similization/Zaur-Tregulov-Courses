package com.example.mvc.controller;

import com.example.mvc.entity.Employee;
import com.example.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateEmployeeInfo")
    public String updateEmployeeInfo(@RequestParam("employeeId") int id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("employeeId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
