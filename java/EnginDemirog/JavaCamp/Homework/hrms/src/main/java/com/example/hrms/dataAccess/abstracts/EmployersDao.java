package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {

	List<Employers> findByUser_EmailIs(String email);
}
