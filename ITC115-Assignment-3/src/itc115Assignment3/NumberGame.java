package itc115Assignment3;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	
	static Scanner sr = new Scanner(System.in);

	// the instance variables
	private int upperLimit;
	private int mysteryNumber;
	private int guessCount;
	
	// the constructor
	public NumberGame() {
		upperLimit = setUpperLimit();
		mysteryNumber = RNG(upperLimit);
		guessCount = 0;
	}
	
	// the get methods for the instance variables
	public int getUpperLimit(){
		return upperLimit;
	}
	public int getMysteryNumber(){
		return mysteryNumber;
	}
	public int getGuessCount(){
		return guessCount;
	}
	
	// method to get user input to set upperLimit
	protected static int setUpperLimit()
	{
		System.out.print("Enter the upper limit for the number: ");
		int userInput = sr.nextInt();
		return userInput;
	}//end setUpperLimit()
	
	// method using random number generator to set mystery number
	protected static int RNG(int upperLimit)
	{
		Random random = new Random();
		int number = random.nextInt(upperLimit -1) +1;
		return number;
	}//end RNG()
		
	// increment guessCount method
	public void incrementGuessCount(){
		guessCount++;
	}
}
