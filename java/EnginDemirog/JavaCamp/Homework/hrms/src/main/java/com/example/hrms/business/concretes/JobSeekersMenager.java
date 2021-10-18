package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmailService;
import com.example.hrms.business.abstracts.JobSeekersService;
import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.business.concretes.helpers.JobSeekersCheckHelper;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.service.UserCheckService;
import com.example.hrms.dataAccess.abstracts.JobSeekersDao;
import com.example.hrms.entities.concretes.JobSeekers;
import com.example.hrms.entities.concretes.User;
import com.example.hrms.entities.concretes.DTOs.JobSeekersForRegisterDto;

@Service
public class JobSeekersMenager implements JobSeekersService {

	private final JobSeekersDao jobSeekersDao;
	private final UserCheckService userCheckService;
	private final EmailService emailService;
	private UserService userService;

	@Autowired
	public JobSeekersMenager(JobSeekersDao jobSeekersDao, UserCheckService userCheckService, EmailService emailService,
			UserService userService) {
		super();
		this.jobSeekersDao = jobSeekersDao;
		this.userCheckService = userCheckService;
		this.emailService = emailService;
		this.userService = userService;
	}

	@Override
	public DataResult<List<JobSeekers>> getAll() {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findAll(), "İş arayanlar listelendi");
	}

	@Override
	public DataResult<List<JobSeekers>> findByEmailIs(String email) {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findByUser_EmailIs(email));
	}

	@Override
	public DataResult<List<JobSeekers>> findByIdentityNumberIs(String identityNumber) {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findByIdentityNumberIs(identityNumber));
	}

	@Override
	public DataResult<Boolean> checkIfRealPerson(String identityNumber, String firstName, String lastName,
			String birthYear) {
		return new DataResult<>(this.userCheckService.checkIfRealPerson(identityNumber, firstName, lastName, birthYear),
				true);
	}

	@Override
	public Result add(JobSeekersForRegisterDto jobSeekers) {
		var checkEmail = this.findByEmailIs(jobSeekers.getEmail()).getData().size() != 0;
		var checkIdentityNumber = this.findByIdentityNumberIs(jobSeekers.getIdentityNumber()).getData().size() != 0;
		var checkUserRealOrNot = !this.checkIfRealPerson(jobSeekers.getIdentityNumber(), jobSeekers.getFirstName(),
				jobSeekers.getLastName(), jobSeekers.getBirthYear()).getData();
		var checkFields = !JobSeekersCheckHelper.allFieldsAreRequired(jobSeekers);

		if (checkEmail || checkIdentityNumber || checkUserRealOrNot || checkFields) {
			String errorMessage = "";

			if (checkEmail || checkIdentityNumber) {
				errorMessage += "Kimlik veya E-posta zaten kayıtlı ";
			}
			if (checkUserRealOrNot) {
				errorMessage += "Gerçek bir kişi değil ";
			}
			if (checkFields) {
				errorMessage += "Tüm alanlar zorunlu";
			}

			return new ErrorResult(errorMessage);
		}
		User user = new User(jobSeekers.getEmail(), jobSeekers.getPassword());
		userService.add(user);
		JobSeekers jobSeekersNew = new JobSeekers(jobSeekers.getFirstName(), jobSeekers.getLastName(),
				jobSeekers.getIdentityNumber(), jobSeekers.getBirthYear());

		this.jobSeekersDao.save(jobSeekersNew);
		return new SuccessResult(this.emailService.sendEmail(user).getMessage());

	}

}
