package com.grievance.grievance_management.controller;

import org.springframework.web.bind.annotation.RestController;

// import com.grievance.grievance_management.entity.Employee;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    public String Welcome() {
        return "welcome";
    }

    // @GetMapping("/getemployee")
    // public Employee getEmployee(){
       
    // }
    
}
