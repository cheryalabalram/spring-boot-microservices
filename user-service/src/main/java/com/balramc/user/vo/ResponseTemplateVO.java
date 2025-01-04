package com.balramc.user.vo;

import com.balramc.user.entity.UserTable;

/**
 * @author balram
 */
public class ResponseTemplateVO {

    private UserTable user;
    private Department department;

    public UserTable getUser() {
        return user;
    }

    public void setUser(UserTable user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
