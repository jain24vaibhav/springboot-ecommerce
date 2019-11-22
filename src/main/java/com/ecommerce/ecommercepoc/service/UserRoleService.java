package com.ecommerce.ecommercepoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercepoc.dao.UserRoleDao;
import com.ecommerce.ecommercepoc.model.UserRole;

@Service
public class UserRoleService {

	@Autowired
	private UserRoleDao userRole;
	
	public List<UserRole> getUserRoles(){
		return userRole.findAll();
	}
	
	public String addUserRole(UserRole role) {
		try {
			userRole.save(role);
			return "Successfully added";
		}
		catch(Exception e){
			return e.toString();
		}
	}
	
	public String updateUserRole(UserRole role)
	{
		try {
			userRole.save(role);
			return "Succssfully Updated";
		}
		catch(Exception e){
			return e.toString();
		}
		
	}
	
	public String deleteUserRole(int id) {
		try {
			userRole.deleteById(id);
			return "Successfully deleted";
		}
		catch(Exception e){
			return e.toString();
		}
		
	}
}
