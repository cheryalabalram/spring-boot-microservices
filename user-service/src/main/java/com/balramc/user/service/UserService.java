package com.balramc.user.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.balramc.user.entity.User;
import com.balramc.user.repo.UserRepo;
import com.balramc.user.vo.Department;
import com.balramc.user.vo.ResponseTemplateVO;

/**
 * @author balram
 *
 */
@Service
public class UserService {
	
private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired UserRepo userRepo;
	@Autowired RestTemplate restTemplate;
	
	public User saveUser(User user) {
		log.info("User is saving");
		return  userRepo.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		Optional<User> userOptional = userRepo.findById(userId);
		if(userOptional.isPresent()) {
			User user = userOptional.get();
			log.info("User is there");
			Department department= restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
			log.info(department.toString());
			responseTemplateVO.setUser(user);
			responseTemplateVO.setDepartment(department);
		}
		return responseTemplateVO;
	}
	
}
