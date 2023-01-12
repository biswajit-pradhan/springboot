package com.product.app.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product.app.main.model.Product;

@Service
public class ProductService {
	public List<Product> getList() {

		Product e1 = new Product(1, "",1000.0,1);
		Product e2 = new Product(2, "", 2000.0, 2);
		Product e3 = new Product(3, "", 3000.0, 3);

		List<Product> list = Arrays.asList(e1, e2, e3);

		return list;
	}
}
