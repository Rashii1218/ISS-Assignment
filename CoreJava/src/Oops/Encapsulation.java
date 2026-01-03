package Oops;

class BankAccount{
	
	private int accountNo;
	private double balance;
	
	//setter
	void setAccountDetails(int accountNo, double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	//getter
	int getAccountNo()
	{
		return accountNo;
	}
	
	//setter
	double getBalance()
	{
		return balance;
	}
	
}

public class Encapsulation {
	
	public static void main(String[] args)
	{
		BankAccount ac1 = new BankAccount();
		ac1.setAccountDetails(12654321, 250000);
		System.out.println(ac1.getAccountNo());
		System.out.println(ac1.getBalance());
		
	}	
}
