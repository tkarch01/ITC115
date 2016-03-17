
package business;

public enum Roshambo {
	ROCK,
	PAPER,
	SCISSORS;
	
	@Override
	public String toString(){
		String s="";
		if (ordinal() == 0){
			s="rock";
		}else if (this.ordinal() == 1){
			s="paper";
		}else if (this.ordinal() == 2){
			s="scissors";
		}
		return s;
	}
	/* Determines the winner of each Roshambo enum
	 * named for each enum, takes argument of a Roshambo
	 * enum and return true if that enum wins over the 
	 * argument otherwise false.
	 */
	public static boolean 	rock (Roshambo value){
		if (value.equals(SCISSORS)){
			return true;
		}else{
			return false;
		}
	}	
	
	public static boolean 	paper (Roshambo value){
		if (value.equals(ROCK)){
			return true;
		}else{
			return false;
		}
	}	

	public static boolean 	scissors (Roshambo value){
		if (value.equals(PAPER)){
			return true;
		}else{
			return false;
		}
	}	

}