import java.util.Random;

public class Lisa extends Player {

	
	public Lisa() {
		super("Lisa");
	}

	@Override
	public Roshambo generateRoshambo() {
		int choice = (int)(Math.random()*3);
		if (choice == 0)
			return Roshambo.PAPER;
		if (choice == 1)
			return Roshambo.ROCK;
		if (choice == 2)
			return Roshambo.SCISSORS;
		return null;
	}

}
