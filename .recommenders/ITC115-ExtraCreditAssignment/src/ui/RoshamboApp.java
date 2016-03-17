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
		
		
		Console.displayLine();
		do {message =""; //reset message to "" each time thorugh loop
			mySelf.setValue(mySelf.generateRoshambo()); //generate my Roshambo value
			opponent.setValue(opponent.generateRoshambo()); //generate my opponent't Roshambo value
			
			
			
			// create and display outcomes message
			message = "\n" + mySelf.getName() + ": " + mySelf.getValue() + "\n" +
					opponent.getName() + ": " + opponent.getValue() + "\n" +
					 "!\n\n"; 
			Console.displayLine(message);
		}while(Console.getChoice("Play again? (y/n): ","y","n").equalsIgnoreCase("y"));
	}
	
	private String whoWins(String player1, String value1, String player2, String value2){
		String result;
		
		if(value1.equalsIgnoreCase(value2)) {
			result = "Draw!";
		}else{
			result = "other";
		}
				
		return result;
	}

}
