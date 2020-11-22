package com.balramc.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author balram
 *
 */
@Entity
@Table
public class Department {

	@Id @GeneratedValue( strategy = GenerationType.AUTO) private Long id;
	@Column private String name;
	@Column private String location;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location +"]";
	}
}
