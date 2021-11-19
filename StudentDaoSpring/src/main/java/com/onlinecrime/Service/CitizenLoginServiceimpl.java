package com.onlinecrime.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecrime.bean.CitizenBean;
import com.onlinecrime.repository.CitizenDao;


@Service
public class CitizenLoginServiceimpl implements CitizenLoginService {
	
	@Autowired
	private CitizenDao citizendao;

	@Override
	public CitizenBean authenticateCitizen(String username, String password) {
	
		return citizendao.validateOfficer(username, password);
	}

	
}
