package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Students;
import com.example.demo.Service.StudentsService;

@RestController
public class StudentsController {
    
	@Autowired
	StudentsService studentsService;
	
	@PostMapping("Student")
	public String addStudent(@RequestBody Students students) {
		    
		studentsService.addStudent(students);
		
		return "Student Added";
	}
	
	
}
