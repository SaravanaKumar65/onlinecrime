package com.onlinecrime.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlinecrime.bean.WantedCriminalT;



public interface WantedCriminalDaoT extends JpaRepository<WantedCriminalT,Integer>{
	
	//public WantedCriminalT insertCriminalRecord(WantedCriminalT wantedCriminal);
	
	@Query("from WantedCriminalT")
	public List<WantedCriminalT> getAllCriminals();
	
	@Query("from WantedCriminalT where name=:name")
	public List<WantedCriminalT> searchByName(String name);
	
	@Query("from WantedCriminalT where crimeType=:crimeType")
	public List<WantedCriminalT> searchByType(String crimeType);

}
