package com.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.model.LoginData;

public interface LoginService extends JpaRepository<LoginData, String > {

	

}
