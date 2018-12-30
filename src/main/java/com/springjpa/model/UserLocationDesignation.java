package com.springjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_location_designation")
public class UserLocationDesignation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_loc_desig_id")
	private Integer user_loc_desig_id;
	
	@Column(name="designation_id")
	private Integer designation_id;
	
	@Column(name="designation_name")
	private String designation_name;
	
	@Column(name="user_loc_id")
	private Integer user_loc_id;

	public Integer getUser_loc_desig_id() {
		return user_loc_desig_id;
	}

	public void setUser_loc_desig_id(Integer user_loc_desig_id) {
		this.user_loc_desig_id = user_loc_desig_id;
	}

	public Integer getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(Integer designation_id) {
		this.designation_id = designation_id;
	}

	public String getDesignation_name() {
		return designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	public Integer getUser_loc_id() {
		return user_loc_id;
	}

	public void setUser_loc_id(Integer user_loc_id) {
		this.user_loc_id = user_loc_id;
	}

}
