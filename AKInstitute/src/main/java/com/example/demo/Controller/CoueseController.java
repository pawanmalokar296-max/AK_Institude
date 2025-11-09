package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Course;
import com.example.demo.Service.CourseService;

@RestController
public class CoueseController {
	     
	      @Autowired
	      CourseService courseService;
	
	      @PostMapping("Course")
	     public String addCourse(@RequestBody Course course){
	    	 
	    	  courseService.addCourse(course);
	    	  
	    	 return "Course Added";
	     }
	          
	     public void m1() {
	    	  
	    	  System.out.println("Hello word");
	      }

}
