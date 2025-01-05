package com.balramc.user.repo;

import com.balramc.user.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author balram
 *
 */
public interface UserRepo extends JpaRepository<UserTable, Long>{

    Optional<List<UserTable>> findByDepartmentId(Long departmentId);
}
