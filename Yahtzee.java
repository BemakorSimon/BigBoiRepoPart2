import java.util.Random;

public class Yahtzee {
	private int[] count;
	private Die[] dice;
	
	public Yahtzee () {
		dice = new Die[5];
		count = new int[6];
		
		for (int i = 0; i<5; i++) {
			dice[i] = new Die();
		}
		rollAllDice();
		updateCount();

	}
		
	public void rollAllDice() {
		Random rand = new Random();
		for ( int i = 0;  i<5; i++) {
			dice[i].roll();
		}
		
	}
		
	public void rollADie (int dieNumber) {
		dice[dieNumber-1].roll();
	}
	public int getADie (int dieNumber) {
		return dice[dieNumber-1].getValue();
		
	}
	
	public String showDice() {
		String longAns = "";
		longAns = "" + "+------+---+---+---+---+---+" + '\n';
		longAns += "" + "| Dice | 1 | 2 | 3 | 4 | 5 |" + '\n';
		longAns += "" + "+------+---+---+---+---+---+" + '\n';
		longAns += "" + "| Face | " + dice[0].getValue() + " | " + dice[1].getValue() + " | "
					 + dice[2].getValue() + " | " + dice[3].getValue() + " | " 
					 + dice[4].getValue() + " | " + "\n";
		longAns += "" + "+------+---+---+---+---+---+" + '\n';
		
		return longAns;
	}
	
	
	private int countUp(int value) {
        int counter = 0;
        for (int i = 0; i<5; i++) {
        	if (value == dice[i].getValue())
        			counter++;
        }	
		return counter;
	}
	
	public void updateCount() {
		for(int i = 0; i < 6; i++) {
			count[i] = countUp(i + 1);

		}
	}
	public int getScoreOnes() {
		return count[1 - 1] * 1;
	}
	public int getScoreTwos() {
		return count[2 - 1] * 2;
	}
	public int getScoreThrees() {
		return count[3 - 1] * 3;
	}
	public int getScoreFours() {
		return count[4 - 1] * 4;
	}
	public int getScoreFives() {
		return count[5 - 1] * 5;
	}
	public int getScoreSixes() {
		return count[6 - 1] * 6;
	}
	public int getScoreThreeOfAKind() {
		int counter = 0;
		for (int i = 0; i < (count.length); i++) {
			if (count[i] == 3)
				counter = count[i] * (i+1);
		}
		//System.out.println("You scored a 3 of a kind");
		return counter;
	}
	public int getScoreFourOfAKind() {
		int counter = 0;
		for (int i = 0; i < (count.length); i++) {
			if (count[i] == 4)
				counter = count[i] * (i+1);
		}
		//System.out.println("You scored a 4 of a kind");
		return counter;
	}
	public int getScoreFullHouse() {
		boolean ticker = false;
		boolean ticker2 = false;
		for (int i = 0; i < (count.length); i++) {
			if (count[i] == 3)
				ticker = true;
		}
		for (int i = 0; i < (count.length); i++) {
			if (count[i] == 2)
				ticker2 = true;
		}
		//System.out.println("You scored a full house");
		if (ticker && ticker2)
			return 25;
		else 
			return 0;
	}
	public int getScoreSmallStraight() {
			if (count[0] >= 1 && count[1] >= 1 && count[2] >= 1 && count[3] >= 1)
				return 30;
			if (count[1] >= 1 && count[2] >= 1 && count[3] >= 1 && count[4] >= 1)
				return 30;
			if (count[2] >= 1 && count[3] >= 1 && count[4] >= 1 && count[5] >= 1)
				return 30;
		return 0;
	}
	public int getScoreLargeStraight() {
		if (count[0] >= 1 && count[1] >= 1 && count[2] >= 1 && count[3] >= 1 && count[4] >= 1)
			return 30;
		if (count[1] >= 1 && count[2] >= 1 && count[3] >= 1 && count[4] >= 1 && count[5] >= 1)
			return 30;
		return 0;
	}
	public int getScoreChance() {
		int counteringThing = 0;
		for (int i=0; i< count.length; i++) 
			counteringThing += count[i] * (i+1);
		return counteringThing;
	}
	public int getScoreYahtzee() {
		int counter = 0;
		for (int i = 0; i < (count.length); i++) {
			if (count[i] == 5)
				counter = 50;
		}
		//System.out.println("You scored a 5 of a kind(aka Yahtzee)");
		return counter;
		
	}
	public String getScoreCard() {
		return  "           Ones: " + getScoreOnes() + "\n" + 
				"           Twos: " + getScoreTwos() + "\n" + 
				"         Threes: " + getScoreThrees() + "\n" +
				"          Fours: " + getScoreFours()  + "\n" +
				"          Fives: " + getScoreFives() + "\n" +
				"          Sixes: " + getScoreSixes() + "\n" + 
				"\n" + "Three of a Kind: " + getScoreThreeOfAKind() + "\n" +
				" Four of a Kind: " + getScoreFourOfAKind() + "\n" +
				"     Full House: " + getScoreFullHouse() + "\n" + 
				" Small Straight: " + getScoreSmallStraight() + "\n" + 
				" Large Straight: " + getScoreLargeStraight() + "\n" +
				"         Chance: " + getScoreChance() + "\n" + 
				"        Yahtzee: " + getScoreYahtzee() + "\n";
				
				
				
	}
}