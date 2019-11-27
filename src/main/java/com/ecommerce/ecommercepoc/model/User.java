package com.ecommerce.ecommercepoc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue
	private int id;

	@NotNull
	private String firstName;
	private String lastName;

	@NotNull
	@Column(unique = true)
	private String email;
	private Date dob;

	
	@NotNull
	@Column(unique = true)
	private String mobile;

	@NotNull
	private String password;

	@ManyToOne
	private UserRole roleId;

}
