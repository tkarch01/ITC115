package business;

import ui.Console;

public  class Player1 extends Player {

	public Player1() {
		// TODO Auto-generated constructor stub
	}	

	@Override
	public String generateRoshambo() {
		String choice = null;
		switch(Console.getChoice3("Rock, paper, or scissors? (r/p/s): ", "r", "p", "s")){
		case "r":
			choice =  Roshambo.ROCK.toString()	;		
			break;
		case "p":
			choice =  Roshambo.PAPER.toString()	;	
			break;
		case "s":
			choice =  Roshambo.SCISSORS.toString()	;	
			break;
		}
		return choice; 
	}
}