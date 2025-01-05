package com.balramc.department.service;

import com.balramc.department.entity.Department;
import com.balramc.department.repo.DepartmentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author balram
 */
@Service
public class DepartmentService {

    private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);

    @Autowired
    DepartmentRepo departmentRepo;

    public Department saveUser(Department department) {
        log.info("User is saving");
        return departmentRepo.save(department);
    }

    public Department getDepartmentById(Long deptId) {
        log.info("Department Id {}", deptId);
        Department department = new Department();
        Optional<Department> optional = departmentRepo.findById(deptId);
        if (optional.isPresent()) {
            department = optional.get();
        }
        return department;
    }

    public List<Department> findAll(){
        return departmentRepo.findAll();
    }
}
