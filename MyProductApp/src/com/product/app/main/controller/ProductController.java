package com.product.app.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping("/add-product")
	public String addProducts() {
		System.out.println("Dashboard in controller..");
		return "WEB-INF/jsps/dashboard.jsp";
	}
	
	
}