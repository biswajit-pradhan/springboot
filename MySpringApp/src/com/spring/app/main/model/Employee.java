package com.spring.app.main.model;

public class Employee {
	
	private int Id;
	private String name;
	private String city;
	private double salary;
	public Employee() {	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, String city, double salary) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
