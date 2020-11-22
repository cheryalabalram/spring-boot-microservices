package com.balramc.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balramc.user.entity.User;

/**
 * @author balram
 *
 */
public interface UserRepo extends JpaRepository<User, Long>{
	
}
