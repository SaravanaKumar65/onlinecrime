package com.onlinecrime.Service;

import com.onlinecrime.bean.AdminLogin;

public interface AdminLoginService {
	
	public AdminLogin authenticateAdmin(String username,String password);

}
