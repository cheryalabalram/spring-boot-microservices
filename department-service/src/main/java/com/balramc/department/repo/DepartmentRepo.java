package com.balramc.department.repo;

import com.balramc.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author balram
 */
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
