package com.bezkoder.spring.jpa.h2.service;

import com.bezkoder.spring.jpa.h2.model.Employer;

import java.util.List;


public interface EmployerService {
	
	List<Employer> getAllEmployer();
	Employer getEmployerById(Long id);
	Employer saveEmployer(Employer employer);
	String deleteEmployer(Long id);
	Employer updateEmployer(Long id, Employer employer);
	

}
