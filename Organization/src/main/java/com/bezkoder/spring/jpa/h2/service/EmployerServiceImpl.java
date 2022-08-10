package com.bezkoder.spring.jpa.h2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.jpa.h2.model.Employer;
import com.bezkoder.spring.jpa.h2.repository.EmployerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployerServiceImpl implements EmployerService {
	
	@Autowired //inject repository dependency
	EmployerRepository employerRepository;
	
	@Override
	public Employer saveEmployer(Employer employer) {
		return employerRepository.save(employer);
	}
	
	@Override
	public Employer getEmployerById(Long id) {
		Optional<Employer> employer = employerRepository.findById(id);
		if(employer.isPresent()) return employer.get();
		return null;
	}

	@Override
	public List<Employer> getAllEmployer() {
		List<Employer> employers = new ArrayList<Employer>();
		employerRepository.findAll().forEach(employer ->employers.add(employer));
		return employers;
	}
	
	@Override
	public Employer updateEmployer(Long id, Employer employer) {
		Optional<Employer> employerById = employerRepository.findById(id);
		
		if(employerById.isPresent()) { 
			Employer updatedEmployer = employerById.get();
		
			updatedEmployer.setId(employer.getId());
			updatedEmployer.setName(employer.getName());
			updatedEmployer.setAge(employer.getAge());
			updatedEmployer.setEmail(employer.getEmail());
			
			return employerRepository.save(updatedEmployer);
		}
		
		return null;
	}

	@Override
	public String deleteEmployer(Long id) {
		employerRepository.deleteById(id); 
		return "id" + id + "is deleted successfully"; 
	}
}
