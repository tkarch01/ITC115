/*
 * ITC 115 W16 - 3182
 * Assignment 5
 * 
 * Thomas Karchesy
 * February 6, 2016
 */

/*
 * Calculates the minimum permutation of coins to give in change.
 * 
 * The application takes the value of change, in cents, to be given and translates it to 
 * the numbers of quarters, dimes, nickels and pennies to be returned. The result will be 
 * the minimum number of coins needed to be given out as change. The results will be printed
 * in columnar format.
 * 
 * @author Thomas Karchesy <tkarch01@seattlecentral.edu> 
 * @import java.util.Scanner for scanner object to input from console
 */

import java.util.Scanner;

/*
 * Contains main method.
 */
public class Main {

	/*
	 * Main method.
	 * 
	 * Contains all the code to complete the function of the application.
	 * 
	 * @object sc Scanner: for user input.
	 * @var change int: Input from user for change amount and used in calculations.
	 * @var status string: Input from user to determine when to end or repeat application.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int change =0;
		String status = "";

		System.out.print("Welcome to the Change Calculator\n");

		/*
		 * Loop encompasses each change finding session. This applicator will always will do at least 
		 * one iteration, therefore we use a do/while loop instead of while loop. Repeating the loop 
		 * will be determined by User response to being asked whether to continue. An answer of var(status)
		 * ='y' will be required to loop.
		 */
		do {
			System.out.print("\nEnter number of cents (0-99): ");
			change = Integer.parseInt(sc.nextLine());
			System.out.println("");

			/*
			 * Cascading succession of conditional statements. Start with largest coin value, quarters,
			 * and go in descending order to second-smallest, nickels. Print out results at each
			 * conditional block. No need for a conditional for the last category, pennies. 
			 * 
			 * If (the value of the var(change) is at least the value of the {coin-value})
			 * 	{ 	
			 * 		then the {number-of-coins} = Math.floorDiv(var(change),{coin-value}.
			 * 		the  {coin-name) and {number-of-coins} is printed in columnar format.
			 * 		var(change) is updated by = to var(change)%{coin-value}.
			 * 	}
			 * else
			 * 	{	
			 * 		0 with {coin-name} is printed in columnar format.
			 * 	}
			 * 
			 * This is repeated for all but the smallest coin value. 
			 * The last choice, which is cents, needs no further calculation and simply
			 * 
			 *  prints var(change) and 'pennies' in columnar format.
			 */
			if (change >= 25) { 
				System.out.printf("%s%d\n", "Quarters: ", Math.floorDiv(change, 25));
				change = change % 25;
			} else
				System.out.printf("%s%d\n", "Quarters: ", 0);
			if (change >= 10) {
				System.out.printf("%s%d\n", "Dimes:    ", Math.floorDiv(change, 10));
				change = change % 10;
			} else
				System.out.printf("%s%d\n", "Dimes:    ", 0);
			if (change >= 5) {
				System.out.printf("%s%d\n", "Nickels:  ", Math.floorDiv(change, 5));
				change = change % 5;
			} else
				System.out.printf("%s%d\n", "Nickels:  ", 0);

			System.out.printf("%s%d\n", "Pennies:  ", change);

			System.out.print("\nContinue? (y/n): ");  // here is where we ask user if wants to do it again
			status = sc.nextLine();
		} while (status.equalsIgnoreCase("y"));   // here is where loop repeats if user wants to do it again

		sc.close();
	}
}

