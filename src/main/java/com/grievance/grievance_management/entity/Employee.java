package com.grievance.grievance_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private long id;

    @Column(name = "emp_name")
    private String employeeName;

    @Column(name = "emp_code",columnDefinition ="character varying(3) not null default 'NA'" )
    private String empCode;

    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department department;

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmp_code() {
        return empCode;
    }

    public void setEmp_code(String empCode) {
        this.empCode = empCode;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
