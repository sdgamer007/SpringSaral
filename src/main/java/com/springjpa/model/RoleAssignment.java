package com.springjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role_assignment")
public class RoleAssignment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "role_id" , nullable = false)
	private Integer role_id; // integer NOT NULL,
	@Column(name = "user_role_id",  nullable = false)
	private Long user_role_id; // bigint NOT NULL,
	@Column(name = "user_loc_id")
	private Long user_loc_id; // bigint,

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Long getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(Long user_role_id) {
		this.user_role_id = user_role_id;
	}

	public Long getUser_loc_id() {
		return user_loc_id;
	}

	public void setUser_loc_id(Long user_loc_id) {
		this.user_loc_id = user_loc_id;
	}

}
