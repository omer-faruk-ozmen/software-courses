package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployersService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employers;
import com.example.hrms.entities.concretes.DTOs.EmployersForRegisterDto;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployersService employersService;

	@Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll() {
		return this.employersService.getAll();
	}

	@PostMapping("/findbyemailis")
	public DataResult<List<Employers>> findByEmailIs(@RequestBody String email) {
		return this.employersService.findByEmailIs(email.toLowerCase().trim());
	}

	@PostMapping("/add")
	public Result add(EmployersForRegisterDto employers) {
		return this.employersService.add(employers);
	}
}
