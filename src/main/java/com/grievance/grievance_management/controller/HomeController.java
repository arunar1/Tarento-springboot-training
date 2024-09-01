package com.grievance.grievance_management.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.grievance.grievance_management.entity.Employee;
import com.grievance.grievance_management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String Welcome() {
        return "welcome";
    }

    @GetMapping("/getemployee")
    public List<Employee> getEmployee(){
        System.out.println(employeeService.getemployee());
       return employeeService.getemployee();
    }
    @PostMapping("/addemployee")
    public Employee savEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getempone")
    public Employee getEmpOne(String emp){
    
        return employeeService.getEmpone(emp);
    }
}
