package com.example.demo.controllers;

import com.example.demo.models.DemoService;
import com.example.demo.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    private final DemoService demoService;

    public StaffController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    public String getStaffs(Model model) {
        List<Employee> employees = demoService.getEmployees();
        model.addAttribute("staffs", employees);
        return "staffs";
    }
}
