package com.flightbook.app.model;

import javax.persistence.*;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String source;
	private String destination;
	private String departure_date;
	private double fare;
	@Override
	public String toString() {
		return "Flight [Id=" + Id + ", source=" + source + ", destination=" + destination + ", departure_date="
				+ departure_date + ", fare=" + fare + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departure_date;
	}
	public void setDepartureDate(String departure_date) {
		this.departure_date = departure_date;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	

}
