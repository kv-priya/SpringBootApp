package com.bezkoder.spring.jpa.h2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.jpa.h2.model.Employee;
import com.bezkoder.spring.jpa.h2.model.Employer;
import com.bezkoder.spring.jpa.h2.repository.EmployeeRepository;
import com.bezkoder.spring.jpa.h2.repository.EmployerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired //inject repository dependency
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee); 
	}
	
	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) return employee.get();
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>(); 
		employeeRepository.findAll().forEach(employee ->employees.add(employee)); 
		return employees;
	}
	
	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Optional<Employee> employeeById = employeeRepository.findById(id);
		
		if(employeeById.isPresent()) { 
			Employee updatedEmployee = employeeById.get();
		
			updatedEmployee.setId(employee.getId());
			updatedEmployee.setName(employee.getName());
			updatedEmployee.setAge(employee.getAge());
			updatedEmployee.setEmail(employee.getEmail());
			
			return employeeRepository.save(updatedEmployee);
		}
		
		return null;
	}

	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id); 
		return "id" + id + "is deleted successfully"; 
	}
}
