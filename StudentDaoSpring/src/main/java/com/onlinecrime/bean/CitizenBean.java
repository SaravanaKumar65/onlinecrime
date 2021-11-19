package com.onlinecrime.bean;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CitizenBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer citizenId;
	
	@NotEmpty(message = "Name")
	private String citizenName;
	
	@Email(message = "email")
	private String email;
	
	@NotNull
	private Integer citizenAge;
	
	
	@NotEmpty(message = "Password size between 8 to 16")
	@Size(min = 8,max = 16)
	private String password;
	
	
	
	public CitizenBean() {
		// TODO Auto-generated constructor stub
	}



	public Integer getCitizenId() {
		return citizenId;
	}



	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}



	public String getCitizenName() {
		return citizenName;
	}



	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getCitizenAge() {
		return citizenAge;
	}



	public void setCitizenAge(Integer citizenAge) {
		this.citizenAge = citizenAge;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
