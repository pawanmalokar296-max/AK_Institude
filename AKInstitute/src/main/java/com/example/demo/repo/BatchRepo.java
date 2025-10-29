package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Batch;

@Service
public interface BatchRepo extends JpaRepository<Batch, Integer> {

}
