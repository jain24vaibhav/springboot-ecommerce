package com.ecommerce.ecommercepoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercepoc.model.Department;

@Repository
public interface DepartmentsDao extends JpaRepository<Department, Integer>{

}
