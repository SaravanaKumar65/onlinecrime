package com.onlinecrime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinecrime.bean.CitizenComplaintBean;

public interface CitizenComplaintDao extends JpaRepository<CitizenComplaintBean, Integer> {
	
//	public CitizenComplaintBean findByCid(Integer cid);
	

}
