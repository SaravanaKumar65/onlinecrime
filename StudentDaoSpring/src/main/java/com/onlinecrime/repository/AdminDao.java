package com.onlinecrime.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.onlinecrime.bean.AdminLogin;


public interface AdminDao extends JpaRepository<AdminLogin,Integer>{
	
	public AdminLogin findByEmailAndPassword(String email,String password);
	
//	@Query("from AdminLogin where email=:email AND password=:password")
//	public AdminLogin validateAdmin(String email, String password);

}
