package com.balramc.department.client;

import com.balramc.department.vo.UserVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface UsersDeclarativeClient {

    @GetExchange(url = "/users/department/{departmentId}")
    public List<UserVO> getUserByDepartmentId(@PathVariable Long departmentId);
}
