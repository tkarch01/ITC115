package business;

/* as specified for Bart */
public class Bart extends Player {
	
	public Bart() {
		this.name = "Bart";
		this.value = this.generateRoshambo();
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
