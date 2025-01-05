package com.balramc.department.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.balramc.department.client.UsersDeclarativeClient;
import com.balramc.department.entity.Department;
import com.balramc.department.service.DepartmentService;
import com.balramc.department.vo.DepartmentVO;
import com.balramc.department.vo.ResponseVO;
import com.balramc.department.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balram
 */
@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    UsersDeclarativeClient usersDeclarativeClient;

    private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/save")
    public Department saveUser(@RequestBody Department department) {
        log.info("Inside saveUser of DepartmentController");
        return departmentService.saveUser(department);
    }

    @GetMapping("/dummy")
    public Department dummySave() {
        log.info("Inside dummy of DepartmentController");
        Department department = new Department();
        department.setName("HR");
        department.setLocation("HYD");
        return departmentService.saveUser(department);
    }

    @GetMapping("/{id}")
    public Department getUserWithDepartment(@PathVariable("id") Long deptId) {
        log.info("Inside getUserWithDepartment of DepartmentController");
        return departmentService.getDepartmentById(deptId);
    }

    @GetMapping
    public ResponseVO findAll() {
        List<Department> all = departmentService.findAll();
        ResponseVO responseVO = new ResponseVO();
        List<DepartmentVO> departmentVOList = new ArrayList<>();
        for (Department department : all) {
            DepartmentVO departmentVO = new DepartmentVO();
            BeanUtils.copyProperties(department, departmentVO);
            departmentVOList.add(departmentVO);
            List<UserVO> usersVoFromAPI = usersDeclarativeClient.getUserByDepartmentId(department.getId());
            responseVO.setUsers(usersVoFromAPI);
        }
        responseVO.setDepartments(departmentVOList);
        return responseVO;
    }

}
