package com.example.hrms.business.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getByIsActive();

	DataResult<List<JobAdvertisement>> getByIsActiveAndCreationDate(Date creationDate, Sort sort);

	DataResult<List<JobAdvertisement>> getByIsActiveAndEmployersId(int employersId);

	Result add(JobAdvertisement jobAdvertisement);

	Result update(JobAdvertisement jobAdvertisement);

	Result delete(JobAdvertisement jobAdvertisement);
}
