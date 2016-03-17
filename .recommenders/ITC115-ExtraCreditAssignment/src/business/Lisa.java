package business;

import java.util.Random;

public class Lisa extends Player {
	
	public Lisa() {
		this.name = "Lisa";
		this.value = this.generateRoshambo();
	}

	@Override
	public String generateRoshambo() {
		String choice = "";
		Random random = new Random();
		int number = random.nextInt(2) +1;
		switch (number){
		case 0:
			choice = Roshambo.ROCK.toString();
			break;
		case 1:
			choice = Roshambo.PAPER.toString();	
			break;
		case 2:
			choice = Roshambo.SCISSORS.toString();
			break;
		}
		return choice;
	}

}
