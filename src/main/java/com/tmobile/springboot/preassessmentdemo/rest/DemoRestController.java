package com.tmobile.springboot.preassessmentdemo.rest;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@RequestMapping("/{num}")
	public HashMap<String, Integer> addTen(@PathVariable int num) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Sum", 10 + num);
		return map;
	}
}
