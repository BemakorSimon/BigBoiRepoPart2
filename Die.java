import java.util.Random;

public class Die {
	private int value;
	public Die  () {
		value = 0;
	}
	public int roll () {
		Random rand = new Random();
		value = (rand.nextInt(6) + 1);
		return value;
	}
	public int getValue () {
		return value;
	}
}