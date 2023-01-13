package com.product.app.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product.app.main.model.Product;

@Service
public class ProductService {
	public List<Product> getList() {

		Product e1 = new Product(1, "Product-1",1000,1);
		Product e2 = new Product(2, "Product-2",2000,2);
		Product e3 = new Product(3, "Product-3",3000,3);
		Product e4 = new Product(4, "Product-4",4000,3);
		Product e5 = new Product(5, "Product-5",5000,3);

		List<Product> list = Arrays.asList(e1,e2,e3,e4,e5);

		return list;
	}
}
