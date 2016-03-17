
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
	public boolean 	rock (Roshambo value){
		if (value.equalsIgnoreCase("scissors")){
			return true;
		}else{
			return false;
		}
	}	
	
	public boolean 	paper (String value){
		
		return false;	
	}	
	
	public boolean 	scissors (String value){
		
		return false;	
	}
}
