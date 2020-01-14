package com.api.APICifo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.api.APICifo.domains.Area;
import com.api.APICifo.domains.Course;
import com.api.APICifo.domains.Offer;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	public List<Course> findByAreaId(Integer id);
	public List<Course> findByNameIgnoreCaseContaining(@Param("name") String name);

}
