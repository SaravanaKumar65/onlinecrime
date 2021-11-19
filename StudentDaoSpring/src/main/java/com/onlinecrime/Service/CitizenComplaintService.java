package com.onlinecrime.Service;


import com.onlinecrime.bean.CitizenComplaintBean;

public interface CitizenComplaintService {
	
	public CitizenComplaintBean registerCitizenComplaintService(CitizenComplaintBean citizencomplaintbean);
	
	public CitizenComplaintBean getComplaintByID(Integer citizenId);

}
