package com.api.APICifo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.APICifo.domains.Course;
import com.api.APICifo.repositories.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> findByAreaId(Integer id){
		return courseRepository.findByAreaId(id);
	}

}
