package com.ecommerce.ecommercepoc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
public class Department {

	@Id
	@GeneratedValue
	private int departmentId;
	@NotNull
	private String departmentName;
}
