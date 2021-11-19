package com.onlinecrime.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class WantedCriminalT {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer criminalId;
	
	@NotEmpty(message = "Name is mandatory")
	@Size(min=3,message = "Minimum size should be 3 character")
	private String name;
	
	private Integer age;
	
	@NotEmpty(message="Must select gender")
	private String gender;
	
	@NotEmpty(message="Must enter identification mark")
	private String idMark;
	
	@NotEmpty(message="Must enter area of crime")
	private String areaOfCrime;
	
	@NotEmpty(message="Must enter type of crime")
	private String crimeType;
	
	
	public WantedCriminalT() {
		
	}
	

	public WantedCriminalT(Integer criminalId,
			@NotEmpty(message = "Name is mandatory") @Size(min = 3, message = "Minimum size should be 3 character") String name,
			Integer age, @NotEmpty(message = "Must select gender") String gender,
			@NotEmpty(message = "Must enter identification mark") String idMark,
			@NotEmpty(message = "Must enter area of crime") String areaOfCrime,
			@NotEmpty(message = "Must enter type of crime") String crimeType) {
		super();
		this.criminalId = criminalId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.idMark = idMark;
		this.areaOfCrime = areaOfCrime;
		this.crimeType = crimeType;
	}
    

	@Override
	public String toString() {
		return "WantedCriminalT [criminalId=" + criminalId + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", idMark=" + idMark + ", areaOfCrime=" + areaOfCrime + ", crimeType=" + crimeType + "]";
	}


	public Integer getCriminalId() {
		return criminalId;
	}
	public void setCriminalId(Integer criminalId) {
		this.criminalId = criminalId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdMark() {
		return idMark;
	}
	public void setIdMark(String idMark) {
		this.idMark = idMark;
	}
	public String getAreaOfCrime() {
		return areaOfCrime;
	}
	public void setAreaOfCrime(String areaOfCrime) {
		this.areaOfCrime = areaOfCrime;
	}
	public String getCrimeType() {
		return crimeType;
	}
	public void setCrimeType(String crimeType) {
		this.crimeType = crimeType;
	}

}
