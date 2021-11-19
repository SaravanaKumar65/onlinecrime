package com.onlinecrime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlinecrime.bean.CitizenBean;

public interface CitizenDao extends JpaRepository<CitizenBean, Integer> {
	
	public CitizenBean findByEmailAndPassword(String email,String password);
	
	@Query("from CitizenBean where email=:email AND password=:password")
	public CitizenBean validateOfficer(String email, String password);

	

}
