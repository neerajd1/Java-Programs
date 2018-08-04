package ppp;

import java.util.Scanner;

public class Saving extends Bank implements Ibank{
	Scanner sc = new Scanner(System.in);
	int n = 0;
	private int amount;
	double min_bal = 200;
	private double balance;
	
	Saving(int account_number,double balance,int amount)
	{
		super( account_number, balance);
		this.amount = amount;
		this.balance = balance;
	}
	
	{
		System.out.println("enter option ");
	    n = sc.nextInt();
	
	}
	
	//Saving s = new Saving();
	{
		System.out.println(amount);
		System.out.println(balance);
		System.out.println(account_number);
	}
		{switch(n) {
	  
	case 1 :withdraw();
			break;
	
	case 2: deposit();
			break;
			
	case 3: checkbalance();
			break;
	
	 default:
			break;
	
	
	}
	
		}
	public void withdraw() {
		
		
		if((this.balance<=min_bal)&&(this.balance<this.amount))
		{
			System.out.println("insufficient balance");
			
		}
		else 
		{
		this.balance = this.balance - this.amount;
		System.out.println("balance is" +this.balance);
		}
		
	}

	@Override
	public void deposit() 
	{
		
		
		this.balance = this.balance + this.amount;
		System.out.println("balance is" +this.balance);
	}

	@Override
	public void checkbalance() 
	{
		System.out.println("your balance is :"+this.balance);
		
	}
	
	
	
	
	

}
