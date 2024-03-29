package com.ecommerce.ecommercepoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class UserRole {

	@Id
	@GeneratedValue
	private int roleId;
	@Column(nullable=false, unique=true, length=20)
	private String roleName;
}
