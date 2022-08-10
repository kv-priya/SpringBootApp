package com.bezkoder.spring.jpa.h2.service;

import com.bezkoder.spring.jpa.h2.model.Department;
import com.bezkoder.spring.jpa.h2.model.Employer;

import java.util.List;


public interface DepartmentService {
	
	List<Department> getAllDepartment();
	Department getDepartmentById(Long id);
	Department saveDepartment(Department department);
	String deleteDepartment(Long id);
	Department updateDepartment(Long id, Department department);
	

}
