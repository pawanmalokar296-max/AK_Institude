package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;
import com.example.demo.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
    
  @Autowired
  CourseRepo repos;
	
	@Override
	public void addCourse(Course course) {
		
		  repos.save(course);
	}
}
