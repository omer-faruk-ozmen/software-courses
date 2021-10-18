package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.EmailService;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.entities.concretes.User;

public class EmailMenager implements EmailService {

	@Override
	public Result sendEmail(User user) {
		return new SuccessResult("E-posta başarıyla şu adrese gönderildi: " + user.getEmail());
	}

}
