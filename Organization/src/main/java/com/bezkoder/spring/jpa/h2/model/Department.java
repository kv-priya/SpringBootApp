package com.bezkoder.spring.jpa.h2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //mark class as entity
@Table //defining class name as Table name
public class Department {
	
	@Column //defining id as primary key
	@Id
	private Long id;
	
	@Column 
	private String name;
	
	@Column
	private Integer numberOfDepartments;
	
	@Column
	private String departmentHead;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberOfDepartments() {
		return numberOfDepartments;
	}
	public void setNumberOfDepartments(Integer numberOfDepartments) {
		this.numberOfDepartments = numberOfDepartments;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}
	

}
