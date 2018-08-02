package session3;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Student s[] = new Student[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			s[i]=new Student();
			System.out.println("Enter ID :- ");
			s[i].setStudentId(sc.nextInt());
			System.out.println("Enter student name for ID " +s[i].getStudentId()+":- ");
			s[i].setStudentName(sc.next());
			System.out.println("Enter marks in subject1 for ID " +s[i].getStudentId()+":- ");
			s[i].setMarks1(sc.nextFloat());
			System.out.println("Enter marks in subject2 for ID " +s[i].getStudentId()+":- ");
			s[i].setMarks2(sc.nextFloat());
			System.out.println("Enter marks in subject3 for ID " +s[i].getStudentId()+":- ");
			s[i].setMarks3(sc.nextFloat());

		}

		for (int i = 0; i < 2; i++) {

			System.out.println(s[i]);

		}

	}

}
