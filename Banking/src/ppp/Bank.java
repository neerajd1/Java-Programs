package ppp;

public class Bank {
	
	 public String bname;
	 int account_number;
	 double balance;
	 
	 
	 Bank(int account_number,double balance)
	 {
		 this.account_number = account_number;
		 this.balance = balance;
		 this.bname= "hey";
	 }


	@Override
	public String toString() {
		return "Bank [bname=" + bname + ", account_number=" + account_number + ", balance=" + balance + "]";
	}
	
	

}
