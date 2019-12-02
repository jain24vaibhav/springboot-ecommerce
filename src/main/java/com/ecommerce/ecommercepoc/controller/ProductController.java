package com.ecommerce.ecommercepoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping("/getproductsbydepartmentid/{depid}")
	public List<Product> getProductByDepartmentId(@PathVariable int depid){
		return products.getproductsByDepartmentId(depid);
	}
	
	@RequestMapping("/getproductsbydepartmentname/{depname}")
	public List<Product> getProductByDepartmentName(@PathVariable String depname){
		return products.getproductsByDepartmentName(depname);
	}
	
	@RequestMapping("/getobj/{depname}")
	public List<Object> getobj(@PathVariable String depname){
		return products.getobj(depname);
	}


	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public String addDepartment(@RequestBody Product pro) {
		return products.addProduct(pro);
	}

	@RequestMapping(value="/updateproduct", method=RequestMethod.PUT)
	public String updateDepartment(@RequestBody Product pro) {
		return products.updateProduct(pro);
	}

	@RequestMapping(value="/deleteproduct", method=RequestMethod.DELETE)
	public String updateDepartment(@PathVariable int id) {
		return products.deleteProduct(id);
	}
}
