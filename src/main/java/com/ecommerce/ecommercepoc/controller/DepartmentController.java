package com.ecommerce.ecommercepoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommercepoc.model.Department;
import com.ecommerce.ecommercepoc.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService department;

	@RequestMapping("/getdepartments")
	public List<Department> getAllDepartments() {
		return department.getAllDepartments();
	}

	@RequestMapping("/adddepartment")
	public String addDepartment(@RequestBody Department dep) {
		return department.addDepartment(dep);
	}

	@RequestMapping("/updatedepartment")
	public String updateDepartment(@RequestBody Department dep) {
		return department.updateDepartment(dep);
	}

	@RequestMapping("/deletedepartment/{id}")
	public String updateDepartment(@PathVariable int id) {
		return department.deleteDepartment(id);
	}
}
