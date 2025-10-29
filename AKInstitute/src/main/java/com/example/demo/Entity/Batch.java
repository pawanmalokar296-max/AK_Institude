package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Batch {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
 	  private int id;
	  private String duration;
	  private String time;
	     
	  
	  
	  @ManyToMany
	  @JoinTable(name ="batch_student" , 
	   joinColumns = @JoinColumn(name = "batch_id"),
	   inverseJoinColumns = @JoinColumn(name ="student_id") )

	  private List<Students> student;
	  
	public List<Students> getStudent() {
		return student;
	}
	public void setStudent(List<Students> student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}	  
	     

}
