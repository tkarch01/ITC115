package business;

import java.text.NumberFormat;

import db.StartUp;

public class Account implements  Depositable, Withdrawable, Balanceable {
	
	double balance;
	
	public Account(){
		this.balance = 0;		
	}

	public Account(double balance){
		this.balance = balance;		
	}

	public double getBalance(){
				
		return this.balance;
	}
	
	public void setBalance(){
		this.balance = StartUp.BALANCE;
	}
	
	public String getBalanceFormatted(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		return currency.format(getBalance());
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance += amount;
	}
	

}
