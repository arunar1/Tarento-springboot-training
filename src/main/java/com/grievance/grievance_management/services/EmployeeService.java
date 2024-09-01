package com.grievance.grievance_management.services;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grievance.grievance_management.entity.Employee;
import com.grievance.grievance_management.repositories.EmployeeRespo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRespo employeeRespo;

    public EmployeeService() {
    }

    public List<Employee> getemployee() {
        return employeeRespo.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRespo.save(employee);
    }

    public Employee getEmpone(String emp) {
        return employeeRespo.findByEmployeeName(emp);
    }


}

    
