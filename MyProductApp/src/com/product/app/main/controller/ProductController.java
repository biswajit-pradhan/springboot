package com.product.app.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.app.main.model.Product;
import com.product.app.main.service.ProductService;

@Controller
public class ProductController {
	static {
		System.out.println("Controller..");
	}

	@RequestMapping("/")
	public String showDashboard() {
		System.out.println("Dashboard In Controller");
		return "WEB-INF/jsps/dashboard.jsp";
	}
	
	@RequestMapping("/all-products-link")
	public String showAllProductLink(HttpServletRequest request,ProductService productService,Model model) {
		System.out.println("Clicked on All Products Link on DashBoard Page");
		List<Product> productList=productService.getList();
		model.addAttribute("list",productList);
		return "WEB-INF/jsps/productsList.jsp";
	}
	
	@RequestMapping("/add-products-link")
	public String addProductLink() {
		System.out.println("Clicked on Add Products Link on DashBoard Page or Add Products Button on add-products-link Page");
		System.out.println("Redirecting to products.jsp");
		return "WEB-INF/jsps/products.jsp";
	}
	
	@RequestMapping("/add-product")
	public String addProducts(@RequestParam("pid") int pid ,@RequestParam("ptitle") String ptitle,@RequestParam("pprice") double pprice,@RequestParam("prating") double prating,HttpServletRequest request) {
		System.out.println("add-products called from add-products-link");
		Product product=new Product();
		product.setId(pid);
		product.setPrice(pprice);
		product.setRating(prating);
		product.setTitle(ptitle);
		System.out.println("Product Added to List");
		System.out.println(product);
		String cpath = request.getContextPath();
		return "redirect: "+cpath+"/add-products-link";
	}
}