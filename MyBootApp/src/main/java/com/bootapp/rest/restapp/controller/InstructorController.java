package com.bootapp.rest.restapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootapp.rest.restapp.model.Instructor;
import com.bootapp.rest.restapp.service.InstructorService;



@RestController
@RequestMapping("/api/instructor")
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	
	@PostMapping("/add")
	public ResponseEntity<String> postInstructor(@RequestBody Instructor instructor) {
		instructorService.postInstructor(instructor);
		return ResponseEntity.status(HttpStatus.OK).body("Instructor Posted..");
	}
	
	@GetMapping("/getall")
	public  List<Instructor> getAllInstructor() {
		List<Instructor> list=instructorService.getAllInstructor();
		return list;
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Object> getInstructorById(@PathVariable("id") int id) {
		
		Optional<Instructor> optional=instructorService.getInstructorById(id);
		if(optional==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ID Given");
		}
		else {
			Instructor instructor=optional.get();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(instructor);
		}
	}
	
}
