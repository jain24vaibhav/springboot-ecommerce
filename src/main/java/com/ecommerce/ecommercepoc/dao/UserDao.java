package com.ecommerce.ecommercepoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.ecommercepoc.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.email=:email and u.password=:password")
	User login(@Param("email") String email, @Param("password") String password);
	
	
	@Query("from User u where u.email=:email")
	User findByEmail(@Param("email") String email);
}
