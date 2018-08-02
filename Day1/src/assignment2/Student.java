package assignment2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		String studentName[]=new String[3];
		int studentId[]=new int[3];
		int studentMarks[]=new int[3];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Student name:");
			studentName[i]=sc.next();
			System.out.println("Enter Student id:");
			studentId[i]=sc.nextInt();
			System.out.println("Enter Student marks:");
			studentMarks[i]=sc.nextInt();
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println("\nStudent Name:"+studentName[i]);
			System.out.println("Student Id:"+studentId[i]);
			System.out.println("Student Marks:"+studentMarks[i]);
		}
		sc.close();
	}

}
