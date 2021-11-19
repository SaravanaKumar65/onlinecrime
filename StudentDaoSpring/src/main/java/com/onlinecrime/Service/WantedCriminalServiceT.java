package com.onlinecrime.Service;

import java.util.List;

import com.onlinecrime.Exceptions.CriminalNotFoundException;
import com.onlinecrime.bean.WantedCriminalT;

public interface WantedCriminalServiceT {	
	
	public WantedCriminalT insertCriminalRecord(WantedCriminalT wantedCriminal);
	
	public List<WantedCriminalT> getAllCriminals();
	
	public List<WantedCriminalT> searchByName(String name) throws CriminalNotFoundException;
	
	public List<WantedCriminalT> searchByType(String crimeType) throws CriminalNotFoundException;
	
	public WantedCriminalT updateCriminal(WantedCriminalT wcCriminal);
	
	public List<WantedCriminalT> deleteCriminal(Integer criminalId) throws CriminalNotFoundException;
	
	public WantedCriminalT getCriminalById(Integer criminalId) throws CriminalNotFoundException;


}
