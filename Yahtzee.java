import java.util.Random;

public class Yahtzee {
	private Die[] dice;
	
	public Yahtzee () {
		dice = new Die[5];
		
		for (int i = 0; i<5; i++) {
			dice[i] = new Die();
		}
	}
		
	public void rollAllDice() {
		Random rand = new Random();
		for ( int i = 0;  i<5; i++) {
			dice[i].roll();
		}
	}
		
	public void rollADice (int dieNumber) {
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
}
