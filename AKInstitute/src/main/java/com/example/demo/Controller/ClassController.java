package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

	      @GetMapping("hello")
	      public void main() {
	    	  
	    	  
	    	   System.out.println("hello word");
	    	  
	      }
	
}
