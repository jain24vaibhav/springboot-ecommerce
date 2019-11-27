package com.ecommerce.ecommercepoc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercepoc.dao.UserDao;

import lombok.var;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	
	@Autowired
	private UserDao user;
	
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("before");
		var user = userService.findByEmail(username);
		if(user!=null) {
			return new User(user.getEmail(),user.getPassword(),new ArrayList<>());	
		}
		else {
			throw new UsernameNotFoundException(username);
		}	
	}
}