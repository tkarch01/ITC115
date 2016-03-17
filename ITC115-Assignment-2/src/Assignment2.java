/*
* ITC 115 W16 - 3182
* Assignment 2
* 
* Thomas Karchesy
* January 16, 2016
* 
* IDE: Eclipse IDE for Java Developers
* JDK: 1.8.0_66 
*/

import java.util.Random;
import java.util.Scanner;


public class Assignment2 {
static Scanner sr = new Scanner(System.in);

// I am not using error handling because it was not specified in the instructions
// If I was using error handling, I would us exception try and catch blocks (I think?)

	public static void main(String[] args) {
		
		// vars 
		int result = 0;
		int userGuess = 0;
		int mysteryNumber = 0;
		
		// greet user
		System.out.println("Welcome to the Number Guessing Game\n");
		
		// get a mystery number
		mysteryNumber = RNG();

		// start the game - I am using a do/while instead of a while because I 
		// am starting with result = 0, if I started with result = something_else
		// I would use a while instead. I have my reasons
		do{
		userGuess = GetUserInput();
		result = CheckUserGuess(mysteryNumber, userGuess);
		Response(result);
		}while (result !=0);
		
		System.out.println("Correct!\n");

		// game over - say goodbye
		System.out.println("Bye");

	}// end main()
	
	// method to get user input for upper bounds of mystery number
	protected static int GetUpperLimit()
	{
		System.out.print("Enter the upper limit for the number: ");
		int userInput = sr.nextInt();
		System.out.println("OK, I'm thinking of a number between 0 and " + userInput +"\n");
		return userInput;
	}//end GetUpperLimit()
	
	// method using random number generator to get mystery number
	protected static int RNG()
	{
		Random random = new Random();
		
		int upperLimit = GetUpperLimit();
		int number = random.nextInt(upperLimit -1) +1;
		
		return number;
	}//end RNG()
	
	// method to get user's guess of mystery number
	protected static int GetUserInput()
	{
		System.out.print("Enter you guess: ");
		int userInput = sr.nextInt();
		return userInput;
	}//end GetUserInput()
	
	// method used to check if users guess is right and which direction is wrong - high or low
	protected static int CheckUserGuess(int knownNumber, int guess)
	{
		int value = knownNumber - guess; 
		return value;
	}//end CheckUserGuess()
	
	// method to give hint to user whether last guess was high or low
	protected static void Response(int myCheck)
	{
		if (myCheck<0){
			System.out.println("Your guess is too high.\n");
		}else if (myCheck>0){
			System.out.println("Your guess is too low.\n"); 
		}//end if
	}//end Response()
	
}
