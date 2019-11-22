package com.ecommerce.ecommercepoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommercepoc.model.UserRole;
import com.ecommerce.ecommercepoc.service.UserRoleService;

@RestController
public class UserRoleController {

	@Autowired
	private UserRoleService userRole;
	
	@RequestMapping("/getroles")
	public List<UserRole> getUserRole(){
		return userRole.getUserRoles();
	}
	
	@RequestMapping(value="/addrole", method=RequestMethod.POST)
	public String addUserRole(@RequestBody UserRole role) {
		return userRole.addUserRole(role);
	}
	
	@RequestMapping(value="/updaterole",method=RequestMethod.PUT)
	public String updateUserRole(@RequestBody UserRole role) {
		return userRole.updateUserRole(role);
	}
	
	@RequestMapping(value="/deleterole/{id}",method=RequestMethod.DELETE)
	public String deleteUserRole(@PathVariable int id) {
		return userRole.deleteUserRole(id);
	}
}

