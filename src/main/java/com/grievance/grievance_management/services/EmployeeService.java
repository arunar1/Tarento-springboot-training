package com.grievance.grievance_management.services;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grievance.grievance_management.entity.Employee;
import com.grievance.grievance_management.repositories.EmployeeRespo;

@Service
public class EmployeeService {
    @Autowired EmployeeRespo employeeRespo;

    public EmployeeService(){

    }

    public List<Employee> getemployee(){
        return employeeRespo.findAll();
    }
}
