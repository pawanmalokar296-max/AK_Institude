package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Batch;
import com.example.demo.Entity.Students;
import com.example.demo.repo.BatchRepo;
import com.example.demo.repo.StudentRepo;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{

	@Autowired
	BatchRepo repo;
	
	@Autowired
	StudentRepo repository;
	
	@Override
	public void enrollMent(int bId, int sId) {
		 
		   Batch batch=  repo.findById(bId).get();
		   Students students =repository.findById(sId).get();		   
		   
		     batch.getStudent().add(students);
		              
		    repo.save(batch);
	}

}
