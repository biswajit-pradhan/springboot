package com.food.app.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	static {
		System.out.println("You are in Controller");
	}

	@RequestMapping("/")
	public String showDashboard() {
		System.out.println("Dashboard in Controller");
		return "WEB-INF/jsps/dashboard.jsp";
	}
	
	@RequestMapping("/biswajit-resturant")
	public String showBiswajitResturant(Model model,HttpServletRequest request) {
		return "WEB-INF/jsps/biswajitResturant.jsp";
	}
	@RequestMapping("/debasish-resturant")
	public String showDebasishResturant() {
		return "WEB-INF/jsps/debasishResturant.jsp";
	}
}
