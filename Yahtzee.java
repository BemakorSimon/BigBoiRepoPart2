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
		for (int i = 0; i< (count.length-1); i++) {
		
		}
		return 1;
	}
	public int getScoreFourOfAKind() {
		return 1;
	}
	public int getScoreFullHouse() {
		return 1;
	}
	public int getScoreSmallStraight() {
		return 1;
	}
	public int getScoreLargeStraight() {
		return 1;
	}
	public int getScoreChance() {
		return 1;
	}
	public int getScoreYahtzee() {
		return 1;
	}
}
