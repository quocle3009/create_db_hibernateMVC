package com.springmvc.hibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.hibernate.models.Product;
import com.springmvc.hibernate.services.ProductService;

public class ControllerProduct {
	@Autowired
	public ProductService productService;

	@GetMapping("/list")
	public String listProducts(Model theModel) {
		List<Product> theProducts = productService.getProducts();
		theModel.addAttribute("products", theProducts);
		return "list-products";
	}
}
