package com.api.APICifo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.APICifo.domains.Center;
import com.api.APICifo.services.CenterService;

@RestController
public class CenterController {
	
	@Autowired
	CenterService centerService;
	
	//Get all centers
	@GetMapping("/api.cifo/centres")
	public List<Center> getCenters(){
		return centerService.getCenters();
	}
	
	//Get center by Id
	@GetMapping("/api.cifo/centres/{id}")
	public Center getCenterById(@PathVariable Integer id) {
		return centerService.getCenterById(id);
	}

}
