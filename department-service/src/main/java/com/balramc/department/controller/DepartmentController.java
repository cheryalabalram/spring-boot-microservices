package com.balramc.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balramc.department.entity.Department;
import com.balramc.department.service.DepartmentService;

/**
 * @author balram
 *
 */
@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {
	
	@Autowired DepartmentService departmentService;
	
	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/save")
    public Department saveUser(@RequestBody Department department) {
        log.info("Inside saveUser of DepartmentController");
        return departmentService.saveUser(department);
    }

    @GetMapping("/{id}")
    public Department getUserWithDepartment(@PathVariable("id") Long deptId) {
        log.info("Inside getUserWithDepartment of DepartmentController");
        return departmentService.getDepartmentById(deptId);
    }
	
}
