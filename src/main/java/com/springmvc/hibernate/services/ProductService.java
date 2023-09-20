package com.springmvc.hibernate.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.hibernate.dao.ProductDAO;
import com.springmvc.hibernate.models.Product;

public class ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Transactional
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

}
 