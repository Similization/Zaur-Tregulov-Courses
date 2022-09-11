package com.simis.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForEmployees() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoForHRs() {
        return "view_for_all_hrs";
    }

    @GetMapping("/manager_info")
    public String getInfoForManagers() {
        return "view_for_all_managers";
    }
}
