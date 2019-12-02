package com.ecommerce.ecommercepoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercepoc.dao.ProductsDao;
import com.ecommerce.ecommercepoc.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductsDao products;
	
	public List<Product> getAllProducts(){
		return products.findAll();
	}
	
	public List<Product> getproductsByDepartmentId(int depId){		
		return products.getProductsByDepartmentId(depId);
	}
	
	public List<Product> getproductsByDepartmentName(String depName){		
		return products.getProductsByDepartmentName(depName);
	}
	
	public List<Object> getobj(String depname) {
		return products.getobj(depname);
	}
	
	public String addProduct(Product pro) {
		try {
			products.save(pro);
			return "Successfully added";
		}
		catch (Exception e) {
			return e.toString();
		}
	}
	
	public String updateProduct(Product pro) {
		try {
			products.save(pro);
			return "Successfully updated";
		}
		catch (Exception e) {
			return e.toString();
		}
	}
	
	public String deleteProduct(int id) {
		try {
			products.deleteById(id);
			return "Successfully deleted";
		}
		catch (Exception e) {
			return e.toString();
		}
	}


	
}
