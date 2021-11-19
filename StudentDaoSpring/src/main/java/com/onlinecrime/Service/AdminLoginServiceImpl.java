package com.onlinecrime.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecrime.bean.AdminLogin;
import com.onlinecrime.repository.AdminDao;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
	
	@Autowired
	private AdminDao admindao; 

	@Override
	public AdminLogin authenticateAdmin(String username, String password) {
		
		return admindao.findByEmailAndPassword(username, password);
	}

	

}
