package com.springjpa.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springjpa.model.LoginData;
import com.springjpa.model.ServiceMaster;
import com.springjpa.service.LoginService;
import com.springjpa.service.ServiceMasterService;
import com.springjpa.service.impl.LoginServiceImpl;

@Transactional
@Controller
@SessionAttributes("name")
public class LoginController {

	@PersistenceContext
	private EntityManager manager;

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private ServiceMasterService  serviceMasterService;

	@RequestMapping(value = { "/login", "/" }, method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {

		return "login";
	}

	@RequestMapping(value = { "/login", "/" }, method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String signNo, @RequestParam String password) {
				

		List<Object[]> values = validateUser(signNo, password);
		if (signNo.equals(null) || signNo == "") {

			System.out.println("here123");
			model.put("nameErrorMessage", "UserName cannnot be empty");
			return "login";

		}

		else if ((password.equals(null) || password == "")) {
			System.out.println("here123");
			model.put("passwordErrorMessage", "Password cannnot be empty");
			return "login";
		} /*
			 * else if (values.size() == 0 || (!values.get(0).equals(signNo))) {
			 * System.out.println("here" + !values.get(0).equals(signNo));
			 * model.put("errorMessage", "Invalid Credentials"); return "login";
			 * 
			 * }
			 */
		model.put("signNo", signNo);
		model.put("password", password);
		
		return "welcome";
	}

	private List<Object[]> validateUser(String signNo, String password) {
		// TODO Auto-generated method stub'

		String queryStr = "SELECT loginData.signNo,loginData.userId,loginData.userName,"
				+ " roleAssignment.roleId, roleMaster.roleName, userLocation.departmentLevelName,"
				+ " userLocation.departmentId, userLocationDesignation.designationId, "
				+ " userLocationDesignation.designationName FROM  RoleAssignment roleAssignment ,LoginData loginData,"
				+ " RoleMaster roleMaster, UserLocation userLocation,UserLocationDesignation userLocationDesignation"
				+ " WHERE (loginData.userId = roleAssignment.userId) AND (roleAssignment.roleId =  roleMaster.roleId)"
				+ " AND (loginData.userId = userLocation.userId) AND (userLocation.userLocId = userLocationDesignation.userLocId)"
				+ " AND loginData.signNo ='" + signNo + "'  AND loginData.passwd= '" + password + "' ";

		try {
			@SuppressWarnings("unchecked")
			List<Object[]> results = manager.createQuery(queryStr).getResultList();
			List<LoginData> data = loginService.findBySignNoAndPasswd(signNo, password);
			List<ServiceMaster> values = serviceMasterService.findByDeptCode("727");
			System.out.println(values.get(0).getDeptCode());
			
			System.out.println(data);
			return results;

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}