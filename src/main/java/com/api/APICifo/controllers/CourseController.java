package com.api.APICifo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.APICifo.domains.Course;
import com.api.APICifo.domains.Offer;
import com.api.APICifo.services.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/api.cifo/areas/{id}/cursos")
	public List<Course> getCoursesByAreaId(@PathVariable Integer id){
		return courseService.findByAreaId(id);
	}
	
	//Get offers by chars
	@GetMapping("/api.cifo/cursos/{name}")
	public List<Course> getOffersByChars(@PathVariable String name){
		return courseService.getCoursesByChars(name);
	}

}
