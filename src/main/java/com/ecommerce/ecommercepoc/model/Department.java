package com.ecommerce.ecommercepoc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Department {

	@Id
	@GeneratedValue
	private int departmentId;
	@Column(nullable = false, unique = true, length = 20)
	private String departmentName;
	
}
