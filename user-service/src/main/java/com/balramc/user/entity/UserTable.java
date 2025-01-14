package com.balramc.user.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author balram
 */
@Setter
@Getter
@Entity
@Table
public class UserTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String emailId;
    @Column
    private String mobile;
    @Column
    private String location;
    @Column
    private Long departmentId;

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobile=" + mobile + ", location="
                + location + ", departmentId=" + departmentId + "]";
    }

}
