package business;

import java.text.NumberFormat;

public class CheckingAccount extends Account {
	
	public CheckingAccount(){
		this.monthlyFee = 0;
	}

	public CheckingAccount(double balance, double monthlyFee){
		this.balance = balance;
		this.monthlyFee = monthlyFee;
	}
	private double monthlyFee;
	
	public void subtractMonthlyFee(){
		this.balance -= this.monthlyFee;	
	}
	
	public void setMonthyFee(double monthlyFee){	
		this.monthlyFee =  monthlyFee;
	}
	
	 double getMonthyFee(){	
		return monthlyFee;
	}
	
	public String getMonthlyFeeFormatted(){	
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getMonthyFee());
	}
}
