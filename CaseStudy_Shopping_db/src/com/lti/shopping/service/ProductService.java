package com.lti.shopping.service;

import java.util.ArrayList;

import com.lti.shopping.entity.Product;

public interface ProductService {
	abstract ArrayList<Product> getProductDetails();
	abstract ArrayList<Product> addProductDetails(Product p);
	abstract ArrayList<Product> searchProduct(int Prodid);
}
