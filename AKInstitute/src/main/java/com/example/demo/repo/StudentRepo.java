package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Students;

@Service
public interface StudentRepo extends JpaRepository<Students, Integer>{

}
