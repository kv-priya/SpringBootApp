package com.bezkoder.spring.jpa.h2.service;

import com.bezkoder.spring.jpa.h2.model.Employee;

import java.util.List;


public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	Employee getEmployeeById(Long id);
	Employee saveEmployee(Employee employee);
	String deleteEmployee(Long id);
	Employee updateEmployee(Long id, Employee employee);
	

}
