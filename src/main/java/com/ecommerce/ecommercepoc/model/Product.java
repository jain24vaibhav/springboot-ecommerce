package com.ecommerce.ecommercepoc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int productId;
	@NotNull
	private String productName;
	@NotNull
	private String productPrice;
	@NotNull
	private String productMRP;
	private String productDescription;
	@NotNull
	private String availableQuantity;
	@NotNull
	private String soldQuantity;	
	
	@ManyToOne
	@JoinColumn(name="depertment_id", referencedColumnName = "departmentId")
	@NotNull
	private Department department;
}
