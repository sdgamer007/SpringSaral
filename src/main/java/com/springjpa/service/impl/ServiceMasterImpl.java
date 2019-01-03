package com.springjpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.model.ServiceMaster;
import com.springjpa.repo.ServiceMasterRepository;
import com.springjpa.service.LoginService;
import com.springjpa.service.ServiceMasterService;

@Service
public class ServiceMasterImpl implements ServiceMasterService{
	
	@Autowired
	ServiceMasterRepository serviceMasterRepository;

	@Override
	public List<ServiceMaster> findByDeptCode(String deptCode) {
		
		
		List<ServiceMaster> values = serviceMasterRepository.findByDeptCode("727");
		return values;
	}
	
	

}
