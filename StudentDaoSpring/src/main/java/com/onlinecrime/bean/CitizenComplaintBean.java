package com.onlinecrime.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class CitizenComplaintBean {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	
	@NotEmpty(message = "Name")
	@Size(min=3,message = "Minimum size should be 3 charecter")
	private String username;
	
	@Email(message = "Email")
	private String email;
	
	@NotNull(message = "age")
	private Integer age;
	
	
	@NotEmpty(message = "Mobile")
	private String mobile;
	
	@NotEmpty(message = "TypeOfCrime")
	private String typeofcrime;
	
	@Past(message="DOB sould be in the past")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate crimedate;
	
	@Past(message="DOB sould be in the past")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate dateT;
	
	@NotEmpty(message = "desc")
	@Lob
	private String description;
	

	
	
	
	public CitizenComplaintBean() {
		// TODO Auto-generated constructor stub
	}





	public Integer getCid() {
		return cid;
	}





	public void setCid(Integer cid) {
		this.cid = cid;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Integer getAge() {
		return age;
	}





	public void setAge(Integer age) {
		this.age = age;
	}





	public String getMobile() {
		return mobile;
	}





	public void setMobile(String mobile) {
		this.mobile = mobile;
	}





	public String getTypeofcrime() {
		return typeofcrime;
	}





	public void setTypeofcrime(String typeofcrime) {
		this.typeofcrime = typeofcrime;
	}





	public LocalDate getCrimedate() {
		return crimedate;
	}





	public void setCrimedate(LocalDate crimedate) {
		this.crimedate = crimedate;
	}





	public LocalDate getDateT() {
		return dateT;
	}





	public void setDateT(LocalDate dateT) {
		this.dateT = dateT;
	}





	public String getDescription() {
		return description;
	}





	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

	

}
