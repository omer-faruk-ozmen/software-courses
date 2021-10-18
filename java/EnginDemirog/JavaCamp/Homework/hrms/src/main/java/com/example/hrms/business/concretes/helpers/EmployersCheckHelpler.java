package com.example.hrms.business.concretes.helpers;

import com.example.hrms.entities.concretes.DTOs.EmployersForRegisterDto;

public class EmployersCheckHelpler {
	public static boolean allFieldsAreRequired(EmployersForRegisterDto employer){
        if (employer.getEmail().strip().isEmpty()
                || employer.getPassword().strip().isEmpty()
                || employer.getCompanyName().strip().isEmpty()
                || employer.getWebAddress().strip().isEmpty())
        {
            return false;
        }
        return true;
    }

}
