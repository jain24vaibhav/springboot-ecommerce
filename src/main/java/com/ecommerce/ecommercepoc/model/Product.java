package com.ecommerce.ecommercepoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@Column(nullable=false, unique=true, length=100)
	private String productName;
	@Column(nullable=false)
	private String productPrice;
	@Column(nullable=false)
	private String productMRP;
	@Column(nullable=false)
	private String productDescription;
	@Column(nullable=false)
	private String availableQuantity;
	@Column(nullable=false)
	private String soldQuantity;	
	
	@ManyToOne
	@JoinColumn(name="depertment_id", referencedColumnName = "departmentId", nullable=false)
	private Department department;
}
