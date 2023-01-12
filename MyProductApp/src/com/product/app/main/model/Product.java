package com.product.app.main.model;

public class Product {
	private int id;
	private String title;
	private double price;
	public Product(int id, String title, double price, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", rating=" + rating + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	private int rating;
	public Product() {}
	
}
