package com.onlinecrime.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecrime.bean.PoliceOfficerT;
import com.onlinecrime.repository.PoliceOfficerDaoT;

@Service
public class PoliceOfficerServiceTImpl implements PoliceOfficerServiceT{
	@Autowired
	private PoliceOfficerDaoT poDao;

	@Override
	public PoliceOfficerT registerPolice(PoliceOfficerT policeOfficerT) {
			return poDao.save(policeOfficerT);
		}
	
	
}
