package com.balramc.user.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author balram
 */
@Setter
@Getter
public class Department {

    private Long id;
    private String name;
    private String location;

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
    }
}
