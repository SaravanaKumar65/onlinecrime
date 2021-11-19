package com.onlinecrime.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecrime.Exceptions.CriminalNotFoundException;
import com.onlinecrime.bean.WantedCriminalT;
import com.onlinecrime.repository.WantedCriminalDaoT;

@Service
public class WantedCriminalServiceTImpl implements WantedCriminalServiceT {
	@Autowired
	private WantedCriminalDaoT wcDao;

	@Override
	public WantedCriminalT insertCriminalRecord(WantedCriminalT wantedCriminal) {
		return wcDao.save(wantedCriminal);
	}

	@Override
	public List<WantedCriminalT> getAllCriminals() {
		return wcDao.findAll();
	}

	@Override
	public List<WantedCriminalT> searchByName(String name) throws CriminalNotFoundException{
		return wcDao.searchByName(name);
	}

	@Override
	public List<WantedCriminalT> searchByType(String crimeType) throws CriminalNotFoundException{
		return wcDao.searchByType(crimeType);
	}

	@Override
	public WantedCriminalT updateCriminal(WantedCriminalT wcCriminal) {
		return wcDao.save(wcCriminal);
	}

	@Override
	public List<WantedCriminalT> deleteCriminal(Integer criminalId) throws CriminalNotFoundException{
		Optional<WantedCriminalT> opt=wcDao.findById(criminalId);
		if(!opt.isPresent()) {
			System.out.println("Doesn't Exist");
		}
		
		WantedCriminalT wc=opt.get();
		wcDao.delete(wc);
		return wcDao.findAll();
	}

	@Override
	public WantedCriminalT getCriminalById(Integer criminalId) throws CriminalNotFoundException{
		return wcDao.getById(criminalId);
	}

	

}
