package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hrms.business.abstracts.EmailService;
import com.example.hrms.business.abstracts.EmployersService;
import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.business.concretes.helpers.EmployeesCheckHelper;
import com.example.hrms.business.concretes.helpers.EmployersCheckHelpler;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmployersDao;
import com.example.hrms.entities.concretes.Employers;
import com.example.hrms.entities.concretes.User;
import com.example.hrms.entities.concretes.DTOs.EmployersForRegisterDto;

public class EmployersMenager implements EmployersService {

	private EmployersDao employersDao;
	private EmailService emailService;
	private UserService userService;

	@Autowired
	public EmployersMenager(EmployersDao employersDao, EmailService emailService, UserService userService) {
		super();
		this.employersDao = employersDao;
		this.emailService = emailService;
		this.userService = userService;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll());
	}

	@Override
	public DataResult<List<Employers>> findByEmailIs(String email) {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findByUser_EmailIs(email));
	}

	@Override
	public Result add(EmployersForRegisterDto employers) {
		var checkEmail = this.findByEmailIs(employers.getEmail()).getData().size() != 0;
		var checkFields = !EmployersCheckHelpler.allFieldsAreRequired(employers);
		var staffConfirm = !EmployeesCheckHelper.confirmEmployer(employers);

		if (checkEmail || checkFields || staffConfirm) {

			String errorMessage = "";

			if (checkEmail) {
				errorMessage += "Bu e-posta zaten var ";
			}

			if (checkFields) {
				errorMessage += "Tüm alanlar zorunlu ";
			}

			if (staffConfirm) {
				errorMessage += "Kayıt onay işleminiz reddedildi ";
			}

			return new ErrorResult(errorMessage);

		}
		User user = new User(employers.getEmail(), employers.getPassword());
		userService.add(user);
		Employers employersNew = new Employers(user.getId(), employers.getCompanyName(), employers.getWebAddress(),
				false);

		this.employersDao.save(employersNew);

		return new SuccessResult(this.emailService.sendEmail(user).getMessage());
	}
}
