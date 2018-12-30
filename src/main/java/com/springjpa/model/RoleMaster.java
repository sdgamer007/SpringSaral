
package com.springjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role_master")
public class RoleMaster {
	
	
/*    role_id integer NOT NULL,
    role_name character varying(100) COLLATE "default".pg_catalog,
    sign_role character varying(10) COLLATE "default".pg_catalog,
    CONSTRAINT role_master_pkey PRIMARY KEY (role_id)*/

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer role_id;
	
	@Column(name="role_name")
	private String role_name;
	
	@Column(name="sign_role")
	private String sign_role;

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getSign_role() {
		return sign_role;
	}

	public void setSign_role(String sign_role) {
		this.sign_role = sign_role;
	}

	@Override
	public String toString() {
		return "RoleMaster [role_id=" + role_id + ", role_name=" + role_name + ", sign_role=" + sign_role + "]";
	}
	
	
	
	
}
