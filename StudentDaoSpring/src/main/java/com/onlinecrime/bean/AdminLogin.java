package com.onlinecrime.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="admin")
public class AdminLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    
	@Email(message = "Please Enter Valid Email")
	private String email;
	
	
	@NotEmpty(message = "Email is mandatory")
	private String username;
	
	@NotEmpty(message = "Password is mandatory")
	private String password;
	
	
	public AdminLogin() {
		// TODO Auto-generated constructor stub
	}


	


	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
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


	
	



}
