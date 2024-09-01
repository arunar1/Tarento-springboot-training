package com.grievance.grievance_management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grievance.grievance_management.entity.Employee;

@Repository
public interface EmployeeRespo  extends JpaRepository<Employee,Long>{

    Employee findByEmployeeName(String emp);
    
}
