package com.balramc.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balramc.department.entity.Department;

/**
 * @author balram
 *
 */
public interface DepartmentRepo extends JpaRepository<Department, Long>{
	
}
