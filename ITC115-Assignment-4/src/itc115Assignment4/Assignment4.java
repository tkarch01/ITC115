package itc115Assignment4;
/*
* ITC 115 W16 - 3182
* Assignment 4
* 
* Thomas Karchesy
* February 1, 2016
* 
* IDE: Eclipse IDE for Java Developers
* JDK: 1.8.0_66 
*/	

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cn;
		int customerNumber = 0;
		String choice = "y";
		 
		
		// display a welcome message
		System.out.println("Welcome to the Customer Viewer");
		
		 while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter a customer number: ");
			cn = sc.nextLine();
			
			try{ customerNumber = Integer.parseInt(cn);}
		
			catch (NumberFormatException e ) {
				System.out.println("\nError! '" + cn + "' is not a valid number. Tryagain.");
			continue;
			}

			Customer C = CustomerDB.getCustomer(customerNumber);
			
			if (C.getName() == null) {
				System.out.print("\nThere is no customer number " + cn + " in our records.\n\n");
			}else{
				System.out.print(C.getNameAndAddress());
			}
			
			System.out.print("Display another customer? (y/n): ");
			choice = sc.nextLine();
		}
		 
		 
		
		sc.close();	
	}
	
}
