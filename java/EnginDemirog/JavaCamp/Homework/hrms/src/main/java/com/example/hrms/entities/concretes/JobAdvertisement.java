package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisement")
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employers employers;

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	@ManyToOne
	@JoinColumn(name = "position_id")
	private Position position;

	@Column(name = "description")
	private int description;

	@Column(name = "min_wage")
	private int minWage;

	@Column(name = "max_wage")
	private int maxWage;

	@Column(name = "number_of_open_positions")
	private int numberOfOpenPositions;

	@Column(name = "deadline")
	private Date deadline;

	@Column(name = "creation_date")
	private Date creationDate;

	@Column(name = "is_active")
	private boolean isActive;

}
