package com.bootapp.rest.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
//	@RequestMapping(value=" ",method=RequestMethod.GET)
	@GetMapping("/api/hello")
	public String sayHello() {
		return "Hello Spring Boot";
	}
	
}
