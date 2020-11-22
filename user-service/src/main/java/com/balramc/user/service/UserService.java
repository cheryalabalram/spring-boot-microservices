package com.balramc.user.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balramc.user.entity.User;
import com.balramc.user.repo.UserRepo;
import com.balramc.user.vo.ResponseTemplateVO;

/**
 * @author balram
 *
 */
@Service
public class UserService {

private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired UserRepo userRepo;
	
	public User saveUser(User user) {
		log.info("User is saving");
		return  userRepo.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		Optional<User> findById = userRepo.findById(userId);
		if(findById.isPresent()) {
			log.info("User is there");
		}
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
		return vo;
	}
	
}
