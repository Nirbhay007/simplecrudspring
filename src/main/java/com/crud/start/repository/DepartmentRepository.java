package com.crud.start.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.start.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
	
}
