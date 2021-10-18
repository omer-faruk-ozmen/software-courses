package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employers;
import com.example.hrms.entities.concretes.DTOs.EmployersForRegisterDto;

public interface EmployersService {
	DataResult<List<Employers>> getAll();


	DataResult<List<Employers>> findByEmailIs(String email);
	

	Result add(EmployersForRegisterDto employer);
}
