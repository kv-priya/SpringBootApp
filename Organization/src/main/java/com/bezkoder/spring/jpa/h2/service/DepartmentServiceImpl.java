package com.bezkoder.spring.jpa.h2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.jpa.h2.model.Department;
import com.bezkoder.spring.jpa.h2.model.Employer;
import com.bezkoder.spring.jpa.h2.repository.DepartmentRepository;
import com.bezkoder.spring.jpa.h2.repository.EmployerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired //inject repository dependency
	DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department); 
	}
	
	@Override
	public Department getDepartmentById(Long id) {
		Optional<Department> department = departmentRepository.findById(id);
		if(department.isPresent()) return department.get();
		return null;
	}

	@Override
	public List<Department> getAllDepartment() {
		List<Department> departments = new ArrayList<Department>(); 
		departmentRepository.findAll().forEach(department ->departments.add(department)); 
		return departments;
	}
	
	@Override
	public Department updateDepartment(Long id, Department department) {
		Optional<Department> departmentById = departmentRepository.findById(id);
		
		if(departmentById.isPresent()) { 
			Department updatedDepartment = departmentById.get();
		
			updatedDepartment.setId(department.getId());
			updatedDepartment.setName(department.getName());
			updatedDepartment.setNumberOfDepartments(department.getNumberOfDepartments());
			updatedDepartment.setDepartmentHead(department.getDepartmentHead());
			
			return departmentRepository.save(updatedDepartment);
		}
		
		return null;
	}

	@Override
	public String deleteDepartment(Long id) {
		departmentRepository.deleteById(id); 
		return "id" + id + "is deleted successfully"; 
	}
}
