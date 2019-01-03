package com.springjpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.model.ServiceMaster;

public interface ServiceMasterRepository  extends JpaRepository<ServiceMaster, Integer>{
	void sysout();
	List<ServiceMaster> findByDeptCode(String deptCode);

}
