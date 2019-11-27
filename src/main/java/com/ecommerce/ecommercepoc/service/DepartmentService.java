package com.ecommerce.ecommercepoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercepoc.dao.DepartmentsDao;
import com.ecommerce.ecommercepoc.model.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentsDao department;
	
	public List<Department> getAllDepartments(){
		return department.findAll();
	}
	
	public String addDepartment(Department dep) {
		try {
			department.save(dep);
			return "Successfully added";
		}
		catch(Exception e) {
			return e.toString();
		}
	}
	
	public String updateDepartment(Department dep) {
		try {
			department.save(dep);
			return "Successfully Updated";
		}
		catch (Exception e) {
			return e.toString();			
		}
	}
	
	public String deleteDepartment(int id) {
		try {
			department.deleteById(id);
			return "Successfully deleted";
		}
		catch(Exception e){
			return e.toString();
		}
	}
}
