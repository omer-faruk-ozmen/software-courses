package com.example.hrms.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementMenager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;

	public JobAdvertisementMenager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive() {

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActive());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndCreationDate(Date creationDate, Sort sort1) {
		Sort sort = Sort.by(Sort.Direction.ASC, "creationDate");
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.getByIsActiveAndCreationDate(creationDate, sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployersId(int employersId) {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.getByIsActiveAndEmployersId(employersId));
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı Eklendi");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı güncellendi");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {

		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş ilanı pasif yapıldı");
	}

}
