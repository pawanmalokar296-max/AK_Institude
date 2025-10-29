package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EnrollmentService;

@RestController
public class EnrollmentController {
	
	    @Autowired
	    EnrollmentService enrollmentService;
	
      @GetMapping("Enroll/{bId}/{sId}")                               
	 public String saveEnroll(@PathVariable int bId,@PathVariable int sId) {
		 
    	  enrollmentService.enrollMent(bId, sId);
		 return "Enrollment";
	 }
	
}
