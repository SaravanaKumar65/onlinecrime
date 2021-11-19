package com.onlinecrime.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="police_officert")
public class PoliceOfficerT {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer polId;
	
	@NotEmpty(message = "Name is mandatory")
	@Size(min=3,message = "Minimum size should be 3 character")
	private String name;
	
	@Email(message = "Enter Valid Email Address")
	private String email;
	
	@NotEmpty(message = "Password is mandatory")
	private String password;
	
	//@NotEmpty(message = "Age is mandatory")
	private Integer age;
	
	@Past(message="DOB sould be in the past")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate dob;
	
	@NotEmpty(message="Must select gender")
	private String gender;
	
	@NotEmpty(message="Must select designation")
	private String designation;
	
	//@NotEmpty(message="Must enter salary")
	private String salary;
	//private WantedCriminal wantedCriminal;
	
	
	public PoliceOfficerT() {
		
	}
	
	public PoliceOfficerT(Integer polId,
			@NotEmpty(message = "Name is mandatory") @Size(min = 3, message = "Minimum size should be 3 charecter") String name,
			@Email(message = "Enter Valid Email Address") String email,
			@NotEmpty(message = "Password is mandatory") String password,
			 Integer age,
			@Past(message = "DOB sould be in the past") LocalDate dob,
			@NotEmpty(message = "Must select gender") String gender,
			@NotEmpty(message = "Must select designation") String designation,
			String salary) {
		super();
		this.polId = polId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "PoliceOfficer [polId=" + polId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", age=" + age + ", dob=" + dob + ", gender=" + gender + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

	public Integer getPolId() {
		return polId;
	}
	public void setPolId(Integer polId) {
		this.polId = polId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}
	


}
