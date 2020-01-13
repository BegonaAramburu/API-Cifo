package com.api.APICifo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.APICifo.domains.Area;
import com.api.APICifo.services.AreaService;

@RestController
public class AreaController {
	
	@Autowired
	AreaService areaService;
	
	@GetMapping("/api.cifo/areas")
	public List<Area> getAreas(){
		return areaService.getAreas();
	}
	
	@GetMapping("/api.cifo/areas/{id}")
	public Area getAreaById(@PathVariable Integer id) {
		return areaService.getAreaById(id);
	}
	
	/*@GetMapping("/api.cifo/areas")
	public ResponseEntity<Object> getAreas(){
		List<JSONObject> 
	}*/

}
