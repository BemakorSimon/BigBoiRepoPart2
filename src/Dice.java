import java.util.Random;

public class Dice {
	
	int random = 0;
	
	public int give () {
		Random rand = new Random();
		random = (rand.nextInt(6) + 1);
		return random;
	}
	public void reset () {
		random = 0;
	}
}
