package com.balramc.department.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResponseVO {
    private List<DepartmentVO> departments;
    private List<UserVO> users;
}
