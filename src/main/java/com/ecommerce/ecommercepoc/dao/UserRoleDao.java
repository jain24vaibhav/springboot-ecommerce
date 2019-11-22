package com.ecommerce.ecommercepoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommercepoc.model.UserRole;

public interface UserRoleDao extends JpaRepository<UserRole, Integer> {

}
