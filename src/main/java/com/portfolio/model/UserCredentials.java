package com.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class UserCredentials {

	@Id
	@Column(name="EMAIL")
	private String email_ID;
	
	@NotEmpty
	@Column(name="PASSWORD", nullable=false)
	private String password;
	

	public String getEmail_ID() {
		
		System.out.println(" ---------- ******* GET " +email_ID);
		return email_ID;
		
		
	}
	public void setEmail_ID(String email_ID) {
		System.out.println(" ---------- ******* SET " +email_ID);
		this.email_ID = email_ID;
	}
	public String getPassword() {
		System.out.println(" ---------- ******* GET  " +password);
		
		return password;
	}
	public void setPassword(String password) {
		System.out.println(" ---------- ******* SET PASS  " +password);
		this.password = password;
	}
	
	
	
	
}
 