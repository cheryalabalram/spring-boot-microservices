package com.balramc.user.repo;

import com.balramc.user.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author balram
 *
 */
public interface UserRepo extends JpaRepository<UserTable, Long>{
	
}
