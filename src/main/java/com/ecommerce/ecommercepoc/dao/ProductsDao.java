package com.ecommerce.ecommercepoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercepoc.model.Product;


@Repository
public interface ProductsDao extends JpaRepository<Product, Integer> {

}
