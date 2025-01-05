package com.balramc.department.vo;


import lombok.Getter;
import lombok.Setter;

/**
 * @author balram
 */

@Getter
@Setter
public class UserVO {

    private Long id;
    private String name;
    private String emailId;
    private String mobile;
    private String location;
    private Long departmentId;

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobile=" + mobile + ", location="
                + location + ", departmentId=" + departmentId + "]";
    }

}
