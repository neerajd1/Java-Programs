package com.lti.shopping.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.lti.shopping.entity.Product;
import com.lti.shopping.util.DbUtil1;

public class ProductDaoImpl implements IProductDao {
	Connection conn =null;
	DbUtil1 util = null;

	public ProductDaoImpl() throws SQLException {
		util = new DbUtil1();
	}

	@Override
	public ArrayList<Product> getProductDetails() {
		
		ArrayList<Product> ProductList =new ArrayList<Product>();
		
		ResultSet rs=null;
		
		try {
			conn=util.getConnectionFromPool();
			Statement stmt =conn.createStatement();
			 rs =stmt.executeQuery("Select * from Products");
			while(rs.next())
			{
				int id =rs.getInt(1);
				String name=rs.getString(2);
				float cost =rs.getFloat(3);
				Product p1=new Product(id,name,cost);
				ProductList.add(p1);
				
			}
			return ProductList;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return ProductList;
		
	}

	@Override
	public ArrayList<Product> addProductDetails(Product P) {
		ArrayList<Product> ProductList =new ArrayList<Product>();
		try {
			conn=util.getConnectionFromPool();
			int id=P.getProdId();
			String name=P.getProdName();
			double cost=P.getProdPrice();
			PreparedStatement stmt= conn.prepareStatement("insert into Products values("+id+",'"+name+"',"+cost+")");
			int i=stmt.executeUpdate();
			System.out.println(i+" Record Inserted ");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return ProductList;
	}

	@Override
	public ArrayList<Product> searchProduct(int Prodid) {
		ArrayList<Product> ProductList =new ArrayList<Product>();
		ResultSet rs=null;
		try {
			conn=util.getConnectionFromPool();
			Statement stmt =conn.createStatement();
			 rs =stmt.executeQuery("Select * from Products where ProdId="+Prodid+""); 
			while(rs.next())
			{
				int id =rs.getInt(1);
				String name=rs.getString(2);
				float cost =rs.getFloat(3);
				Product p1=new Product(id,name,cost);
				ProductList.add(p1);
				
			}
			return ProductList;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return ProductList;
	}

}
