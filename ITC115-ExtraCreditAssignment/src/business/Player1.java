package business;

import ui.Console;

/* This class is intended for the user. */
public  class Player1 extends Player {

	public Player1() {}	

	@Override
	public Roshambo generateRoshambo() {
		Roshambo choice = null;
		switch(Console.getChoice3("Rock, paper, or scissors? (r/p/s): ", "r", "p", "s")){
		case "r":
			choice =  Roshambo.ROCK	;		
			break;
		case "p":
			choice =  Roshambo.PAPER;	
			break;
		case "s":
			choice =  Roshambo.SCISSORS;	
			break;
		}
		return choice; 
	}
}