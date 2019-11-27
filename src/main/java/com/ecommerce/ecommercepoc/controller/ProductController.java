package com.ecommerce.ecommercepoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommercepoc.model.Product;
import com.ecommerce.ecommercepoc.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService products;
	
	@RequestMapping("/getproducts")
	public List<Product> getAllDepartments() {
		return products.getAllProducts();
	}

	@RequestMapping("/addproduct")
	public String addDepartment(@RequestBody Product pro) {
		return products.addProduct(pro);
	}

	@RequestMapping("/updateproduct")
	public String updateDepartment(@RequestBody Product pro) {
		return products.updateProduct(pro);
	}

	@RequestMapping("/deleteproduct")
	public String updateDepartment(@PathVariable int id) {
		return products.deleteProduct(id);
	}
}
