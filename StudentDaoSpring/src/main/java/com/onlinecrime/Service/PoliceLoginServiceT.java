package com.onlinecrime.Service;

import com.onlinecrime.bean.PoliceOfficerT;

public interface PoliceLoginServiceT {
	public PoliceOfficerT authenticateOfficer(String username,String password);


}
