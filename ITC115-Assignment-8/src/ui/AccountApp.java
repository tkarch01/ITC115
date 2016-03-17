/*
* ITC 115 W16 - 3182
* Assignment 8
* 
*Thomas Karchesy
* March 7, 2016
*/
package ui;

import ui.Console;
import business.CheckingAccount;
import business.Transactions;
import db.StartUp;


public class AccountApp {

	public static void main(String[] args) {
		
		CheckingAccount ca = new CheckingAccount(StartUp.BALANCE, StartUp.CHECKING_FEE);
		/* OR I could use the following in place of the above:
		 * CheckingAccount ca = new CheckingAccount();
		 * ca.setBalance();
		 * ca.setMonthyFee(StartUp.CHECKING_FEE);
		 * 
		 * In the Account.java file setBalance() has a statement 
		 * this.balance = StartUp.BALANCE; which will set the balance the same way.
		 * 
		 * In the real world it is more likely that balance and the monthly fee 
		 * would come from a database, so, I have created an interface, StartUp,
		 * in the db package to supply the balance and monthly fee values. 
		 */

		
		/* Display a welcome message */	
		Console.displayLine("Welcome to the Account Calculator");
		Console.displayLine();
		
		/* Display the starting balance
		 * Get the starting balance from XXXXXXXXXX
		 */
		Console.displayLine("Starting Balance");
		Console.displayLine("Checking: " + ca.getBalanceFormatted());
		Console.displayLine();
		
		Console.displayLine("Enter the transactions for the month");
		
		/* No matter what, we will start the transaction process, so,
		 * we start with a do loop. In the while statement we insert the 
		 * Console.getDouble().equalsIC("y") making it nice and compact.
		 * Console.getDouble() does the error handling.
		 * This makes it unnecessary to create a variable, String choice = "y";.
		 */
		do{
			/* we have two possible choices for transaction: withdrawal or deposit. 
			 * Identify which choice and then ask user for amount. Error handling will be
			 * done within the methods.
			 */
			Console.displayLine();
			if (Console.getChoice("Withdrawal or deposit? (w/d): ", "w", "d").equalsIgnoreCase("w")){
				/* perform the withdrawal
				 * The withdrawal amount must be between zero and checking
				 * account balance inclusive or it won't be accepted.
				 */
				Transactions.withdraw(ca, Console.getDouble("Amount: ", 0, ca.getBalance()));
				Console.displayLine();			
			}else{
				/* perform the deposit
				 * The deposit amount must be between zero and $10,000.00
				 * inclusive or it won't be accepted.
				 */
				Transactions.deposit(ca, Console.getDouble("Amount: ", 0, 10000)); //deposit
				Console.displayLine();
			}
		}while ( Console.getChoice("Continue? (y/n): ", "y", "n").equalsIgnoreCase("y"));
		
		/* Final transaction is to deduct the checking fee from the balance */
		ca.subtractMonthlyFee();
		
		/* Close up by summarizing fees and final balance. */
		Console.displayLine();
		Console.displayLine("Monthly Fees");
		Console.displayLine("Checking fee: " + ca.getMonthlyFeeFormatted());

		Console.displayLine();
		Console.displayLine("Final Balance");
		Console.displayLine("Checking: " + ca.getBalanceFormatted());

	}

}
