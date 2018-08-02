package assignment3;

import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {

		String designation;
		float basicSalary=0;
		int TA=0, HRA=0, TD = 10;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Designation :-");
		designation = sc.next();

		switch (designation) {
		case "manager":
			basicSalary = 20000;
			TA = 5;
			HRA = 10;
			break;
		case "analyst":
			basicSalary = 15000;
			TA = 5;
			HRA = 20;
			break;

		}

		System.out.println("Total Salary :- "+ (basicSalary+basicSalary*TA/100+basicSalary*HRA/100-basicSalary*TD/100));
		
		
		
		sc.close();
	}

}
