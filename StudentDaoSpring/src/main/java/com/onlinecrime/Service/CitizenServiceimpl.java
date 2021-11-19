package com.onlinecrime.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecrime.bean.CitizenBean;
import com.onlinecrime.repository.CitizenDao;

@Service
public class CitizenServiceimpl implements CitizenService{
	
	@Autowired
	private CitizenDao cdao;

	@Override
	public CitizenBean registerCitizenService(CitizenBean citizenbean) {
		
		return cdao.save(citizenbean);		
		
	}

	
	
}
