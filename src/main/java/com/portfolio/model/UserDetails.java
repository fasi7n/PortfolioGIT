package com.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserDetails {
	
	@Id
	@Column(name="EMAIL")
	private String email_ID;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
		
	@Column(name="PHONE")
	private String PHONE;
	
	

	public String getEmail_ID() {
		return email_ID;
	}

	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String PHONE) {
		this.PHONE = PHONE;
	}

	

}
