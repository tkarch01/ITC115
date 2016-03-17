/*
 * ITC 115 W16 - 3182
 * Assignment 5
 * 
 * Thomas Karchesy
 * February 15, 2016
 */
/*
 * Returns the area, circumference, and area for a circle of a given radius.
 * 
 * The application creates a circle object using the circle class. The object uses
 * the property radius to provide standard area, circumference, and diameter using 
 * methods from the circle class. The radius is obtained from user input. The values
 * for diameter, circumference,and area of the circle are displayed to the user.
 * 
 * @package assignment6
 * @import java.util.Scanner for scanner object to input from console
 * @author Thomas Karchesy <tkarch01@seattlecentral.edu> 
 * @version 1.0 2016/02/12 
 * @see Circle.java
 * @todo documentation
 */

package assignment6;

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
	 * @var choiceToContinue string: Used to hold input from user whether to repeat application.
	 * @object c Circle: Circle object from Circle class Circle.java.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choiceToContinue = "y";
		Circle c = new Circle(0); //initially set Circle.radius = 0
		
		System.out.println("Welcome to the Circle Calculator\n");
		
		do{
			System.out.print("Enter radius:  ");
			
			try {
				//get radius for circle from user
				c.setRadius(Double.parseDouble(sc.nextLine()));
			}
			catch (NumberFormatException e){ //throws error if user input not double
				System.out.println("Error! Invalid decimal. Try again.");
				continue;
			}
			
			if (c.getRadius() < 0){ //radius must be non negative.
				System.out.println("Error! Radius must be non negative. Try again.");
				continue;
			}
			
			System.out.println("Diameter:      "  + c.diameter());
			System.out.println("Circumference: " + c.circumference());
			System.out.println("Area:          " + c.area());

			System.out.print("\nContinue? (y/n):"); // here is where we ask user if wants to do it again
			choiceToContinue = sc.nextLine();
		}while(choiceToContinue.equalsIgnoreCase("y")); // here is where loop repeats if user wants to do it again
		System.out.println("\nBye!");
		sc.close();
	}

}


