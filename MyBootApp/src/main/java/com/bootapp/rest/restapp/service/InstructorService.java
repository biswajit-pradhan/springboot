package com.bootapp.rest.restapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootapp.rest.restapp.data.InstructorRepository;
import com.bootapp.rest.restapp.model.Instructor;

@Service
public class InstructorService {

	@Autowired
	private InstructorRepository instructorRepository;
	
	public void postInstructor(Instructor instructor) {
		// save instructor in DB
		instructorRepository.save(instructor);

	}

	public List<Instructor> getAllInstructor() {
		List<Instructor> list=instructorRepository.findAll();
		return list;
	}

	public Optional<Instructor> getInstructorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
