package com.ecommerce.ecommercepoc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercepoc.model.Product;


@Repository
public interface ProductsDao extends JpaRepository<Product, Integer> {

	@Query("select p from Product p INNER JOIN p.department d where d.departmentId = :depid")
	List<Product> getProductsByDepartmentId(@Param("depid") int depid);
	
	@Query("select p from Product p INNER JOIN p.department d where d.departmentName = :depName")
	List<Product> getProductsByDepartmentName(@Param("depName") String depName);
	
	@Query("select p.productName,d.departmentId from Product p INNER JOIN p.department d where d.departmentName = :depName")
	List<Object> getobj(@Param("depName") String depName);
}
