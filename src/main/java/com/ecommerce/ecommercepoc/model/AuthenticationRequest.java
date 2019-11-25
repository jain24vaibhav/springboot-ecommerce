package com.ecommerce.ecommercepoc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationRequest {


	private String email;
	private String password;
	
	public AuthenticationRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public AuthenticationRequest() {
		super();
	}

}
