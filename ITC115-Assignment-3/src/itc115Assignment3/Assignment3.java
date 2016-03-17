package itc115Assignment3;
/*
* ITC 115 W16 - 3182
* Assignment 3
* 
* Thomas Karchesy
* January 22, 2016
* 
* IDE: Eclipse IDE for Java Developers
* JDK: 1.8.0_66 
*/	

import java.util.Scanner;

public class Assignment3 {
	
	static Scanner sr = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		// vars 
		int result = 0;
		int userGuess = 0;
		int mysteryNumber = 0;
		int guessCount = 0;
		
		// greet user
		System.out.println("Welcome to the Number Guessing Game\n");
		
		// get intsance of myster number
		NumberGame ng = new NumberGame();
		mysteryNumber = ng.getMysteryNumber();
		
		// Tell user range of mystery number
		System.out.println("OK, I'm thinking of a number between 0 and " + ng.getUpperLimit() +"\n");

		// start the game - I am using a do/while instead of a while because I 
		// want to get at least one guess from the user, therefore, I am
		// starting with result = 0
		do{
		userGuess = GetUserInput();
		ng.incrementGuessCount(); //will not work in GetUserInput()
		result = CheckUserGuess(mysteryNumber, userGuess);
		Response(result);
		}while (result !=0);
		
		// game over - say goodbye
		guessCount = ng.getGuessCount();
		System.out.println("You got it in "+ guessCount + " tries.\n\nBye");

	}// end main()
	
	// method to get user's guess of mystery number
	protected static int GetUserInput()
	{
		System.out.print("Enter you guess: ");
		int userInput = sr.nextInt();
		return userInput;
	}//end GetUserInput()
	
	// method used to evaluate if guess and mysteryNumber the same. returns 0 if true
	protected static int CheckUserGuess(int knownNumber, int guess)
	{
		int value = knownNumber - guess; 
		return value;
	}//end CheckUserGuess()
	
	// method to give hint to user whether last guess was high,low, or correct
	protected static void Response(int myCheck)
	{
		if (myCheck<0){
			System.out.println("Your guess is too high.\n");
		}else if (myCheck>0){
			System.out.println("Your guess is too low.\n"); 
		}else{
			System.out.print("Correct! ");
		}//end if
	}//end Response()
	
}
