package com.springjpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.model.LoginData;

public interface LoginRepository extends JpaRepository<LoginData, String > {

	List<LoginData> findBySignNoAndPasswd(String username, String passwd);
}
