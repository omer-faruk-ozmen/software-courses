package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.Employees;
import com.example.hrms.entities.concretes.Employers;

public interface EmployeesService {
	DataResult<List<Employees>> getAll();

	DataResult<Boolean> confirmEmployers(Employees employees, Employers employers);
}
