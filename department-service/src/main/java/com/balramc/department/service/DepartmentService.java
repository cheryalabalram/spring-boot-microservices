package com.balramc.department.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balramc.department.entity.Department;
import com.balramc.department.repo.DepartmentRepo;
import com.balramc.department.vo.ResponseTemplateVO;

/**
 * @author balram
 *
 */
@Service
public class DepartmentService {

private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired DepartmentRepo departmentRepo;
	
	public Department saveUser(Department department) {
		log.info("User is saving");
		return  departmentRepo.save(department);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		Optional<Department> findById = departmentRepo.findById(userId);
		if(findById.isPresent()) {
			log.info("User is there");
		}
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
		return vo;
	}
	
}
