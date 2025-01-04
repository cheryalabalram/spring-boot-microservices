package com.balramc.user.controller;

import com.balramc.user.entity.UserTable;
import com.balramc.user.service.UserService;
import com.balramc.user.vo.ResponseTemplateVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author balram
 *
 */
@RestController
@RequestMapping(path = "/users")
public class UserController {
	
	@Autowired UserService userService;
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/save")
    public UserTable saveUser(@RequestBody UserTable user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

    @GetMapping("/savedummy")
    public void save(){
        UserTable user = new UserTable();
        user.setDepartmentId(1L);
        user.setLocation("siddipet");
        user.setName("balram");
        user.setEmailId("example@email.com");
        log.info("Inside dummy save of UserController");
        userService.saveUser(user);
    }
}
