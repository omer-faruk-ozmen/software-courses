package com.example.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "JobAdvertisement" })
public class Employers extends User {

	public Employers(int employersId, String companyName, String webAddress, boolean isActivated) {

		this.employersId = employersId;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.isActivated = isActivated;
	}

	@Id
	@Column(name = "user_id")
	private int employersId;

	@Column(name = "cp_name")
	private String companyName;

	@Column(name = "cp_web")
	private String webAddress;

	@Column(name = "cp_phone")
	private String phoneNumber;

	@Column(name = "is_activated")
	private boolean isActivated;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "employers")
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private List<JobAdvertisement> jobAdvertisement;

}
