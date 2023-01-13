package com.spring.app.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.app.main.model.Employee;

@Service
public class EmployeeService {
	public List<Employee> getList(){
		
		Employee e1=new Employee(1,"Harry Potter","London",85000);
		Employee e2=new Employee(2,"Biswajit Pradhan","Bhubaneswar",75000);
		Employee e3=new Employee(3,"Debasish Pradhan","London",95000);
		
		List<Employee> list=Arrays.asList(e1,e2,e3);
		
		return list;
	}
	
	public void saveEmployee(Employee employee) {
		//Go to DB and save this object
		System.out.println("Employee data inserted in DB"+ employee);
	}

	public void deleteEmployee(int id) {
		//Go to db and delete this object
		System.out.println("Employee data deleted");
		
	}
}
