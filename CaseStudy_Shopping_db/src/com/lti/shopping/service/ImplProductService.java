package com.lti.shopping.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.lti.shopping.dao.IProductDao;
import com.lti.shopping.dao.ProductDaoImpl;
import com.lti.shopping.entity.Product;

public class ImplProductService implements ProductService{
	
	private IProductDao DaoService;

	public ImplProductService() throws SQLException {
		DaoService= new ProductDaoImpl();
	}

	@Override
	public ArrayList<Product> getProductDetails() {
	return	DaoService.getProductDetails();
		
	}

	@Override
	public ArrayList<Product> addProductDetails(Product p) {
		 return DaoService.addProductDetails(p);
	}

	@Override
	public ArrayList<Product> searchProduct(int Prodid) {
		return DaoService.searchProduct(Prodid);
	}

}
