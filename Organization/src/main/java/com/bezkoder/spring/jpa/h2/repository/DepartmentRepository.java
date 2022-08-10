package com.bezkoder.spring.jpa.h2.repository;

import org.springframework.data.repository.CrudRepository;

import com.bezkoder.spring.jpa.h2.model.Department;


public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
