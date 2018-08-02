package session1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Program1 
		System.out.println("Welcome!");

		// Demo App
		
		int x, y, res;
		x = 10;
		y = 20;
		res = x + y;
		System.out.println("Result :- "+res);
		
		//it can also be
		
		int x1=10,y1=20,res1=x+y;
		System.out.println("Result :- "+res1);
		
		//Ideal program
		Scanner sc = new Scanner(System.in);
		int number1,number2,result;
		
		System.out.println("Addition Program");
		
		System.out.println("Enter Number 1 :- ");
		number1=sc.nextInt();
		
		
		System.out.println("Enter Number 2 :- ");
		number2=sc.nextInt();
		
		result = number1+number2;
		
		System.out.println("Addition of "+number1+" and "+number2+" is :- "+result);
		*/
		/*Scanner basics */
		Scanner sc = new Scanner(System.in);
		String name,name2;
		System.out.println("1");
		name =sc.next();
		System.out.println("2");
		name2=sc.nextLine();
		System.out.println("3");
		Float fl=sc.nextFloat();
		
		System.out.println("sc.next() :- "+name+"sc.nextLine()"+name2+"sc.nextFloat()"+fl);
		
		
	}

}
