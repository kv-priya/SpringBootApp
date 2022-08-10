package com.bezkoder.spring.jpa.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.spring.jpa.h2.model.Employer;
import com.bezkoder.spring.jpa.h2.service.EmployerService;

import java.util.List;


@RestController
public class EmployerController {
	
	@Autowired
	EmployerService employerService;
	
	@PostMapping("/employer")
	public Employer saveEmployer(@RequestBody Employer employer) {
		return employerService.saveEmployer(employer);
	}
	
	@GetMapping("/employer/{id}")
	public Employer getEmployer(@PathVariable("id") Long id) {
		return employerService.getEmployerById(id);
	}
	
	@GetMapping("/employer")
	public List<Employer> getAllEmployer(){
	 	return employerService.getAllEmployer();
	}
	
	@PutMapping("/employer/{id}")
	public Employer updateEmployer(@PathVariable("id") Long id, @RequestBody Employer employer) {
		return employerService.updateEmployer(id, employer);
	}
	
	@DeleteMapping("/employer/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		return employerService.deleteEmployer(id);
	}

}
