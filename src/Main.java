
public class Main {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int[] counter = new int[11];
		for (int i=0; i<1000; i++) {
			int a = 0;
			int b = 0;
			a = dice1.give();
			b = dice2.give();
			counter[(a+b)-2]++;
			
		}

		for (int i = 0; i<=10; i++) {
			System.out.println(counter[i]);
			
		}
	}

}
