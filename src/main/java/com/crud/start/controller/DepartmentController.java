package com.crud.start.controller;

//Java Program to Illustrate DepartmentController.java File

//Importing packages modules


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import com.crud.start.entity.Department;
import com.crud.start.service.*;
import org.springframework.web.bind.annotation.*;

//Annotation
@RestController
//Class
public class DepartmentController {

	@Autowired private DepartmentService departmentService;

	// Save operation
	@PostMapping("/departments")

	public Department saveDepartment(
		@Validated @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}

	// Read operation
	@GetMapping("/departments")

	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}

	// Update operation
	@PutMapping("/departments/{id}")

	public Department
	updateDepartment(@RequestBody Department department,
					@PathVariable("id") Long departmentId)
	{
		return departmentService.updateDepartment(
			department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/departments/{id}")

	public String deleteDepartmentById(@PathVariable("id")
									Long departmentId)
	{
		departmentService.deleteDepartmentById(
			departmentId);
		return "Deleted Successfully";
	}
}
