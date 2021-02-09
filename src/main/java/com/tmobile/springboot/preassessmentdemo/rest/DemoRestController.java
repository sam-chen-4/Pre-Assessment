package com.tmobile.springboot.preassessmentdemo.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@RequestMapping("/{num}")
	String addTen(@PathVariable int num) {
		return "Sum: " + Integer.toString(num + 10);
	}
}
