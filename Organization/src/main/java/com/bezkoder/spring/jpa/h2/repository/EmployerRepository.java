package com.bezkoder.spring.jpa.h2.repository;

import org.springframework.data.repository.CrudRepository;

import com.bezkoder.spring.jpa.h2.model.Employer;


public interface EmployerRepository extends CrudRepository<Employer, Long> {

}
