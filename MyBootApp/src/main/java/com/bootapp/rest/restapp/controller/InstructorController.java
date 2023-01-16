package com.bootapp.rest.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootapp.rest.restapp.model.Instructor;
import com.bootapp.rest.restapp.service.InstructorService;



@RestController
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	
	@PostMapping("/api/instructor/add")
	public ResponseEntity<String> postInstructor(@RequestBody Instructor instructor) {
		instructorService.postInstructor(instructor);
		return ResponseEntity.status(HttpStatus.OK).body("Employee Posted..");
	}
	
	@GetMapping("/api/instructor/show")
	public  List<Instructor> showEmployeesByDeptID() {
		List<Instructor> list=instructorService.getInstructor();
		return list;
	}
	
}
