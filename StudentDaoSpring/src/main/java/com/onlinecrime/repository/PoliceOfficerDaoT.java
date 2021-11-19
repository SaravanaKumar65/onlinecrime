package com.onlinecrime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlinecrime.bean.PoliceOfficerT;

public interface PoliceOfficerDaoT extends JpaRepository<PoliceOfficerT,Integer>{
	public PoliceOfficerT findByEmailAndPassword(String email,String password);
	
	@Query("from PoliceOfficerT where email=:email AND password=:password")
	public PoliceOfficerT validateOfficer(String email,String password);
}
