package com.springjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_location")
public class UserLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_loc_id")
	private Integer user_loc_id;
	
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="location_id")
	private Integer location_id;
	
	@Column(name="location_type_id")
	private Integer location_type_id;
	
	@Column(name="department_id")
	private Integer department_id;
	
	@Column(name="department_level_id")
	private Integer department_level_id;
	
	@Column(name="department_level_name")
	private String department_level_name;
	public Integer getUser_loc_id() {
		return user_loc_id;
	}
	public void setUser_loc_id(Integer user_loc_id) {
		this.user_loc_id = user_loc_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public Integer getLocation_type_id() {
		return location_type_id;
	}
	public void setLocation_type_id(Integer location_type_id) {
		this.location_type_id = location_type_id;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public Integer getDepartment_level_id() {
		return department_level_id;
	}
	public void setDepartment_level_id(Integer department_level_id) {
		this.department_level_id = department_level_id;
	}
	public String getDepartment_level_name() {
		return department_level_name;
	}
	public void setDepartment_level_name(String department_level_name) {
		this.department_level_name = department_level_name;
	}
	@Override
	public String toString() {
		return "UserLocation [user_loc_id=" + user_loc_id + ", user_id=" + user_id + ", location_id=" + location_id
				+ ", location_type_id=" + location_type_id + ", department_id=" + department_id
				+ ", department_level_id=" + department_level_id + ", department_level_name=" + department_level_name
				+ "]";
	}
	
	

}