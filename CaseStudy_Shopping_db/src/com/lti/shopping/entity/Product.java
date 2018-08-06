package com.lti.shopping.entity;

public class Product {
	int ProdId;
	String ProdName;
	double ProdPrice;
	
	
	public Product() {
		super();
	}
	public Product(int prodId, String prodName, double prodPrice) {
		super();
		ProdId = prodId;
		ProdName = prodName;
		ProdPrice = prodPrice;
	}
	public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public double getProdPrice() {
		return ProdPrice;
	}
	public void setProdPrice(double prodPrice) {
		ProdPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdName=" + ProdName + ", ProdPrice=" + ProdPrice + "]\n";
	}
	

}
