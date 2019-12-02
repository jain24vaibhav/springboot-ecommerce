package com.ecommerce.ecommercepoc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable=false)
	private String firstName;
	private String lastName;

	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private Date dob;

	@Column(nullable=false, unique=true, length=10)
	private String mobile;

	@Column(nullable=false)
	private String password;

	@ManyToOne
	@JoinColumn(name="role_id", referencedColumnName = "roleId", nullable=false)
	private UserRole roleId;

}
