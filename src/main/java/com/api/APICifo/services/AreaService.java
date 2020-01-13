package com.api.APICifo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.APICifo.domains.Area;
import com.api.APICifo.repositories.AreaRepository;


@Service
public class AreaService {
	
	@Autowired
	AreaRepository areaRepository;
	
	//get all areas
	public List<Area> getAreas(){
		return areaRepository.findAll();
	}
	
	//get area by id
	public Area getAreaById(Integer id) {
		Area area = null;
		Optional<Area> areaOptional = areaRepository.findById(id);
		if(areaOptional.isPresent()) {
			area = areaOptional.get();
		}else {
			System.out.println("Area not found");
		}
		return area;
	}
	
		
	
}
