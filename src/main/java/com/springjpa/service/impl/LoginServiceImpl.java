package com.springjpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.model.LoginData;
import com.springjpa.repo.LoginRepository;
import com.springjpa.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService  {
	
	@Autowired
	LoginRepository repository;

	@Override
	public List<LoginData> findBySignNoAndPasswd(String username, String passwd) {
		List<LoginData> list = repository.findBySignNoAndPasswd(username, passwd) ;
		return list;
	}

	
	
	
	
}
