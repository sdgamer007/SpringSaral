package com.springjpa.service;

import java.util.List;

import com.springjpa.model.ServiceMaster;

public interface ServiceMasterService {
	
	List<ServiceMaster> findByDeptCode(String deptCode);


}
