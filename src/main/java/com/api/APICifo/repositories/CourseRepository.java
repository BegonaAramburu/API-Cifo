package com.api.APICifo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.APICifo.domains.Area;
import com.api.APICifo.domains.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	public List<Course> findByAreaId(Integer id);

}
