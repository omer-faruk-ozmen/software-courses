package com.example.hrms.core.utilities.service;

public interface UserCheckService {
	Boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, String birthYear);

}
