package com.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.model.LoginData;

public interface LoginRepository extends JpaRepository<LoginData, String > {
}
