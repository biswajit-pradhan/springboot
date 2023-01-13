package com.product.app.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.product.app.main.model.*;
import com.product.app.main.service.*;

@Controller
public class ProductController {
	static {
		System.out.println("Controller..");
	}

	@RequestMapping("/")
	public String showDashboard() {
		System.out.println("Dashboard in controller..");
		return "WEB-INF/jsps/dashboard.jsp";
	}
	
	@RequestMapping("/all-products")
	public String showAllProducts() {
		System.out.println("Dashboard in controller..");
		return "WEB-INF/jsps/dashboard.jsp";
	}
//	@RequestMapping("/add-product")
//	public String addProducts(@RequestParam("id") int id,@RequestParam("title") String title,@RequestParam("price") double price,@RequestParam("rating") double rating,HttpServletRequest request) {
//		Product product=new Product();
//		product.setId(id);
//		product.setPrice(price);
//		product.setRating(rating);
//		product.setTitle(title);
//		String cpath= request.getContextPath();
//		return "redirect: "+cpath+"/add-product";
//	}
	@RequestMapping("/add-products")
	public String addProducts() {
//		Product product=new Product();
//		product.setId(pid);
//		product.setPrice(pprice);
//		product.setRating(prating);
//		product.setTitle(ptitle);
//		System.out.println(product);
		System.out.println("Products in controller..");
		return "WEB-INF/jsps/products.jsp";
	}
}