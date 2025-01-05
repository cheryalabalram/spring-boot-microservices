package com.balramc.department.vo;


import lombok.Getter;
import lombok.Setter;

/**
 * @author balram
 */
@Setter
@Getter
public class DepartmentVO {


    private Long id;
    private String name;
    private String location;

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
    }
}
