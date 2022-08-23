package com.crud.start.service;

//Java Program to Illustrate DepartmentService.java File

//Importing packages

//Importing required classes
import java.util.List;

import com.crud.start.entity.Department;

//Class
public interface DepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department,
								Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);
}
