package com.example.hrms.entities.concretes.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployersForRegisterDto {


	private String employerId;

	private String companyName;
	
	private String webAddress;
	
	private boolean isActivated;
	
	private String email;
	
	private String password;
}
