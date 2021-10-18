package com.example.hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Sort;

import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	@Query("From JobAdvertisement where isActive=:true")
	List<JobAdvertisement> getByIsActive();

	@Query("From JobAdvertisement where isActive=:true and postingDate=:postingDate")
	List<JobAdvertisement> getByIsActiveAndCreationDate(Date creationDate, Sort sort);

	@Query("From JobAdvertisement where isActive=:true and employerId=:employerId")
	List<JobAdvertisement> getByIsActiveAndEmployersId(int employerId);

}
