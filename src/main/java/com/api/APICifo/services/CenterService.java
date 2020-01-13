package com.api.APICifo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.APICifo.domains.Center;
import com.api.APICifo.repositories.CenterRepository;

@Service
public class CenterService {
	
	@Autowired
	CenterRepository centerRepository;
	
	//Get all centers
	public List<Center> getCenters(){
		return centerRepository.findAll();
	}
	
	//Get center by Id
	public Center getCenterById(Integer id) {
		Center center = null;
		Optional<Center> centerOptional = centerRepository.findById(id);
		if(centerOptional.isPresent()) {
			center = centerOptional.get();
		}else {
			System.out.println("Center not found");
		}
		return center;
	}
	
	

}
