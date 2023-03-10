package com.library.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/insurance")
public class InsuranceController {
	
	@GetMapping("/")
	public ResponseEntity<String> dashboard() {
		return ResponseEntity.status(HttpStatus.OK).body("Welcome to dashboard");
	}
	
}
