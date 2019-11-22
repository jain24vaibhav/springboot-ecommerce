package com.ecommerce.ecommercepoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommercepoc.model.User;
import com.ecommerce.ecommercepoc.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService user;

	@RequestMapping("/getusers")
	public List<User> getAllUsers() {
		return user.getAllUsers();
	}

	@RequestMapping(value = "/updateuser", method = RequestMethod.PUT)
	public String updateUser(@RequestBody User usr) {
		return user.updateUser(usr);
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public String addUser(@RequestBody User usr) {
		return user.addUser(usr);
	}

	@RequestMapping(value = "/deleteuser/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable int id) {
		return user.deleteUser(id);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity login(@RequestBody User usr) {
		Object o = user.login(usr);
		if (o != null) {
			return new ResponseEntity<>("Logged in successfully", HttpStatus.ACCEPTED);
		} else {
			return ResponseEntity.badRequest().body("Invalid email/password");
		}
	}
}
