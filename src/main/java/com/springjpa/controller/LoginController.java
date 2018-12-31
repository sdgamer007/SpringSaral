package com.springjpa.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springjpa.repo.LoginService;

@Transactional
@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService service;
    
    @PersistenceContext
    private EntityManager manager;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        boolean isValidUser = validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessages", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }

	private boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub'
		
		
		 String queryStr = "SELECT loginData.sign_no,loginData.user_id,loginData.user_name,"
		 		+ " roleAssignment.role_id, roleMaster.role_name, userLocation.department_level_name,"
		 		+ " userLocation.department_id, userLocationDesignation.designation_id, "
		 		+ " userLocationDesignation.designation_name FROM  RoleAssignment roleAssignment ,LoginData loginData,"
		 		+ " RoleMaster roleMaster, UserLocation userLocation,UserLocationDesignation userLocationDesignation"
		 		+ " WHERE (loginData.user_id = roleAssignment.user_id) AND (roleAssignment.role_id =  roleMaster.role_id)"
		 		+ " AND (loginData.user_id = userLocation.user_id) AND (userLocation.user_loc_id = userLocationDesignation.user_loc_id)"
		 		+ " AND loginData.sign_no ='"+username+"'  AND loginData.passwd= '"+password+"' ";
		 
		
		 
		 try {
			 List<Object[]> results = manager.createQuery(queryStr).getResultList();
			 
			 if(results.size()>0 && results.get(0).equals(username) && results.get(2).equals(password) )
				 return true;
			 
			 
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw e;
	        }
		return false;
	}

}