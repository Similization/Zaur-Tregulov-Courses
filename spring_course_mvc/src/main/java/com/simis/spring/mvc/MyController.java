package com.simis.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/getInfo")
    public String getEmployeeInfo(Model model) {
        model.addAttribute("employee", new Employee());
        return "first-view-get-info";
    }

//    @RequestMapping("/showInfo")
//    public String showEmployeeInfo() {
//        return "first-view-show-info";
//    }

//    @RequestMapping("/showInfo")
//    public String showEmployeeInfo(HttpServletRequest request, Model model) {
//        String employeeName = request.getParameter("employeeName");
//        employeeName = "Mr. " + employeeName.substring(0, 1).toUpperCase() +
//                employeeName.substring(1).toLowerCase();
//        model.addAttribute("nameAttribute", employeeName);
//        return "first-view-show-info";
//    }

//    @RequestMapping("/showInfo")
//    public String showEmployeeInfo(@RequestParam("employeeName") String empName, Model model) {
//        empName = empName.substring(0, 1).toUpperCase() +
//                empName.substring(1).toLowerCase();
//        model.addAttribute("nameAttribute", empName);
//        return "first-view-show-info";
//    }

//    @RequestMapping("/showInfo")
//    public String showEmployeeInfo(@ModelAttribute("employee") Employee emp) {
//        return "first-view-show-info";
//    }

    @RequestMapping("/showInfo")
    public String showEmployeeInfo(@Valid @ModelAttribute("employee") Employee emp,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "first-view-get-info";
        }
        return "first-view-show-info";
    }
}
