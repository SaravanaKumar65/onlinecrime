package com.onlinecrime.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class CitizenLoginBean { 
	
	@Email(message = "Enter Valid Username!")
	@NotEmpty(message = "Enter Valid Username!")
	private String username;
	@NotEmpty(message = "Enter Valid Password!")
	private String password;
	
	public CitizenLoginBean() {
		// TODO Auto-generated constructor stub
	}

	public CitizenLoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CitizenLoginBean [username=" + username + ", password=" + password + "]";
	}
	
	

}
