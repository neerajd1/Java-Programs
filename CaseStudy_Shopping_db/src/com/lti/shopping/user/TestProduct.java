package com.lti.shopping.user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.lti.shopping.dao.IProductDao;
import com.lti.shopping.dao.ProductDaoImpl;
import com.lti.shopping.entity.Product;
import com.lti.shopping.service.ImplProductService;
import com.lti.shopping.service.ProductService;

public class TestProduct {

	public static void main(String[] args) throws SQLException {
ArrayList<Product> mylist;
		Scanner sc = new Scanner(System.in);
		String ans;
		int no;
		do {
			System.out.println(" ****** ORACLE SHOPPING SERVICES *******");
			System.out.println("1.Display all products ");
			System.out.println("2.Add a new Product ");
			System.out.println("3.Search ");
			System.out.println("4.Update ");
			System.out.println("5.Delete ");
			System.out.println("Please enter your choice : ");
			no = sc.nextInt();

			switch (no) {
			case 1: 
				ProductService service =new ImplProductService();
				mylist=service.getProductDetails();
				System.out.println(mylist);
				break;
			case 2:
				System.out.println(" Enter Id ");
				int id=sc.nextInt();
				System.out.println(" Enter Product name ");
				String name=sc.next();
				System.out.println(" Enter cost ");
				double cost =sc.nextInt();
				Product p =new Product(id,name,cost);
				
				ProductService service1 =new ImplProductService();
				mylist=service1.addProductDetails(p);
				System.out.println(mylist);
				break;
			case 3:
				System.out.println("Enter the Product Id you want to search ");
				int id1=sc.nextInt();
				
				ProductService service2 =new ImplProductService();
				mylist=service2.searchProduct(id1);
				System.out.println(mylist);
				break;
			default:
				System.out.println(" Wrong Choice ! ");
				break;

			}

			System.out.println("Do you wish to continue ? ");
			ans = sc.next();
		} while (ans.equals("Yes") || ans.equals("yes") || ans.equals("y") || ans.equals("Y"));

		System.out.println(" Thank You for shopping !");
		sc.close();
	}

}
