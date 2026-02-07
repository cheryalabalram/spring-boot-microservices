package com.balramc.user.service;

import com.balramc.user.entity.UserTable;
import com.balramc.user.repo.UserRepo;
import com.balramc.user.vo.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author balram
 */
@Service
public class UserService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepo userRepo;

    public UserTable saveUser(UserTable user) {
        log.info("User is saving");
        return userRepo.save(user);
    }

    public List<UserTable> getUserByDepartmentId(Long departmentId) {
        Optional<List<UserTable>> userOptional = userRepo.findByDepartmentId(departmentId);
        if (userOptional.isPresent()) {
            List<UserTable> users = userOptional.get();
            log.info("User is there");
            return users;
        }
        return null;
    }

    public Department getDepartment(Long departmentId) {
        return webClientBuilder.build()
                .get()
                .uri("http://DEPARTMENT-SERVICE/departments/{id}", departmentId)
                .retrieve()
                .bodyToMono(Department.class)
                .block(); // or use reactive chain
    }

}
