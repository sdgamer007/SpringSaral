package com.springjpa.service;

import java.util.List;

import com.springjpa.model.LoginData;

public interface LoginService   {
	
	List<LoginData> findBySignNoAndPasswd(String signNo , String passwd);
	}
