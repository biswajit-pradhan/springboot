package com.product.app.main.model;

public class Product {
	private int id;
	private String title;
	private int price;
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", rating=" + rating + "]";
	}
	private int rating;
	public Product() {}
	public Product(int id, String title, int price, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.rating = rating;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
