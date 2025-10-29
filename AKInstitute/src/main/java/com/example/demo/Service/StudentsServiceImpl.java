package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Students;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentsServiceImpl implements StudentsService{

	 @Autowired
	 StudentRepo repository;
	
	@Override
	public void addStudent(Students student) {
		// TODO Auto-generated method stub
		
		   repository.save(student);
	}

}
