package com.tmobile.springboot.preassessmentdemo.rest;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello user! Please enter an integer as path variable to add 5 to your input. \n"
				+ "Example: https://bootcamp-preassessment.herokuapp.com/10";
	}
	
	//Handles GET requests for an int parameter
	@GetMapping("/{num}")
	public HashMap<String, Integer> addFive(@PathVariable int num) {
		
		//Create new POJO
		HashMap<String, Integer> map = new HashMap<>();
		
		//Assign a key-value pair (add 5 to value)
		map.put("sum", 5 + num);
		
		//Maven dependency Spring Boot Web includes Jackson - returns JSON object
		return map;
	}
}
