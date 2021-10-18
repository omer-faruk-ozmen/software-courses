package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer>{

}
