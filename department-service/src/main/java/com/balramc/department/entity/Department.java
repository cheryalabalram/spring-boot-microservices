package com.balramc.department.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author balram
 */
@Entity
@Table
@Setter
@Getter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String location;

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
    }
}
