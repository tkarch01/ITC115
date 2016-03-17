/*
* ITC 115 W16 - 3182
* Extra Credit Assignment
* 
*Thomas Karchesy
* March 14, 2016
*/
package ui;

import business.Bart;
import business.Lisa;
import business.Player;
import business.Player1;
import business.Roshambo;

public class RoshamboApp {
	
	public static void main(String[] args) {
		
		// need String message for use in showing results
		String message;
		
		/* need two player objects- one for myself and the other for my opponent
		 * my opponent will be either bart or lisa. I will make object when I 
		 * know which one.
		 */
		Player opponent;
		Player1 mySelf = new Player1();

		/* Display a welcome message */	
		Console.displayLine("Welcome to the game of Roshambo");
		Console.displayLine();
		
		/* set my name for the mySelf Object */
		mySelf.setName(Console.getRequiredString("Enter your name:"));
		Console.displayLine();
		
		/* choose who I will play and make their instance */
		if (Console.getChoice("Would you like to play Bart or Lisa? (b/l): ", "b", "l").equalsIgnoreCase("b")){
			//you chose to play Bart
			opponent = new Bart();	
		}else{
			//you chose to play Lisa
			opponent = new Lisa();
		}
		
		/* we always start with one play and the while statement will ask user 
		 * if wants to do it again. */
		do {
			Console.displayLine();
			message =""; //reset message to "" each time through loop
			
			// generate new Roshambo values each time through the loop
			mySelf.setValue(mySelf.generateRoshambo()); //generate my Roshambo value
			opponent.setValue(opponent.generateRoshambo()); //generate my opponent't Roshambo value
		
			// create and display outcomes message - whoWins() returns the winner
			message = "\n" + mySelf.getName() + ": " + mySelf.getValue() + "\n" +
					opponent.getName() + ": " + opponent.getValue() + "\n" +
					whoWins(mySelf.getName(),mySelf.getValue(),opponent.getName(), opponent.getValue()) + "\n"; 
			Console.displayLine(message);
		}while(Console.getChoice("Play again? (y/n): ","y","n").equalsIgnoreCase("y"));
	}
	
	/* determines who is the winner for each play: takes arguments equivalent to
	 * two players - name as string and player's move as Roshambo value from their object.
	 * returns the results as either a draw or name of winner.
	 */
	private static String whoWins(String player1, Roshambo value1, String player2, Roshambo value2){
		String result = null;
		
		if(value1.equals(value2)) {
			result = "Draw!";
		}else{
			if (value1.equals(Roshambo.ROCK)){
				if (Roshambo.rock(value2)){
					result = player1 + " Wins!";
				}else{
					result = player2 + " Wins!";
				}
			}else if(value1.equals(Roshambo.PAPER)){
				if (Roshambo.paper(value2)){
					result = player1 + " Wins!";
				}else{
					result = player2 + " Wins!";
				}
			}else if(value1.equals(Roshambo.SCISSORS)){
					if (Roshambo.scissors(value2)){
						result = player1 + " Wins!";
					}else{
						result = player2 + " Wins!";
					}
			}		
		}
		return result;
	}
}
