package com.example.hrms.core.utilities.service;

public class FakeMernisServiceAdapter implements UserCheckService{

	@Override
	public Boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, String birthYear) {
		
		return true;
	}
}
