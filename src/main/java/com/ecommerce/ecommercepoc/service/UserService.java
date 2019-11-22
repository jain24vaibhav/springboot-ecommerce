package com.ecommerce.ecommercepoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercepoc.dao.UserDao;
import com.ecommerce.ecommercepoc.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao user;
	
	public Object login(User usr) {	
		User u = user.login(usr.getEmail(),usr.getPassword());	
		if(u!=null) {
			return u;
		}
		else {
			return null;
		}
	}
	
	
	public List<User> getAllUsers(){
		return user.findAll();
	}
	
	public String addUser(User usr) {
		try {
			user.save(usr);
			return "Added successfully";
		}
		catch(Exception e) {
			return e.toString();
		}
	}
	
	public String updateUser(User usr) {
		try {
			user.save(usr);
			return "Updated successfully";
		}
		catch(Exception e){
			return e.toString();
		}
	}
	
	public String deleteUser(int id) {
		try {
			user.deleteById(id);
			return "Deleted successfully";
		}
		catch(Exception e) {
			return e.toString();
		}
	}
}
