package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Batch;
import com.example.demo.repo.BatchRepo;

@Service
public class BatchServiceImpl implements BatchService{
       
	@Autowired
	BatchRepo repo;

	
	@Override
	public void saveBatch(Batch batch) {
		// TODO Auto-generated method stub
		  
		
		
		repo.save(batch);
	}

}
