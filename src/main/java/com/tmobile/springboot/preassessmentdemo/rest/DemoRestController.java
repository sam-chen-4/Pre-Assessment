package com.tmobile.springboot.preassessmentdemo.rest;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
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
