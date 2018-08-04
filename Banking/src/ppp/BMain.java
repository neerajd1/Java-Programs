package ppp;

import java.util.Scanner;

public class BMain {
	public static void main(String[] args) {
		
		int amount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount");
		
		amount=sc.nextInt();
		
	
		
		System.out.println("1.Saving\n2.Current");
		//Saving s = new Saving();
		//Current = new Current();
		
	int n = 0;
	n=sc.nextInt();
	
	
	switch(n) {
	  
	case 1:Saving s = new Saving(444,5000,amount);
			break;
	
	case 2:Current c = new Current(444,5000,amount);
			break;
	
	}
		
	}

}
