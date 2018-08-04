package ppp;

public class Current extends Bank implements Ibank{
	
	int n = 0;
	public int amount;
	double min_bal = 0;
	double balance;
	
	Current(int account_number,double balance,int amount)
	{
		super( account_number, balance);
		this.amount = amount;
	}
	
	

	
	/*switch(n) 
	{
	case 1: void withdraw();
			break;
			
	case 2: void deposit();
			break;
			
	case 3: void checkbalance();
			break;
	
	case: default;
		  break;
	}*/
	@Override
	public void withdraw() {
		if((balance<=min_bal)&&(balance<amount))
		{
			System.out.println("insufficient balance");
			
		}
		else 
		{
		balance = balance - amount;
		System.out.println("balance is" +balance);
		}
		
	}

	@Override
	public void deposit() 
	{
		
		
		balance = balance + amount;
		System.out.println("balance is" +balance);
	}

	@Override
	public void checkbalance() 
	{
		System.out.println("your balance is :"+balance);
		
	}
}
	