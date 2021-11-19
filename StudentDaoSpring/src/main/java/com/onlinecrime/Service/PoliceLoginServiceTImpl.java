package com.onlinecrime.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecrime.bean.PoliceOfficerT;
import com.onlinecrime.repository.PoliceOfficerDaoT;

@Service
public class PoliceLoginServiceTImpl implements PoliceLoginServiceT{
	@Autowired
	private PoliceOfficerDaoT poDao;
	
	@Override
	public PoliceOfficerT authenticateOfficer(String username,String password) {
		
		return poDao.validateOfficer(username, password);
	}

}
