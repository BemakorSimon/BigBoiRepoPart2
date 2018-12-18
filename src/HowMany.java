import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Simon Gajewski
 *
 */
public class HowMany {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Random rand = new Random();
			
		
			int counterOf1 = 0;
			int counterOf2 = 0;
			int counterOf3 = 0;
			int counterOf4 = 0;
			int counterOf5 = 0;
			int counterOf6 = 0;
			int randomNum = 0;
			System.out.println("Please enter a number of rolls you want to preform:");
			int userIn = input.nextInt();
			input.nextLine();
			while (userIn < 0) {
				System.out.println("That was not a valid input dummy");
				System.out.println("Follow the directions this time and input a number greater than 0:");
				userIn = input.nextInt();
				input.nextLine();
			}//validator while
			System.out.println("Press enter to roll");
			for (int i = 0;i <= userIn;i++ ) {
				randomNum = rand.nextInt(6) + 1;
				System.out.println("you rolled a " + randomNum);
				switch (randomNum) {
				case 1:
					counterOf1++;
					break;
				case 2:
					counterOf2++;
					break;
				case 3:
					counterOf3++;
					break;
				case 4:
					counterOf4++;
					break;
				case 5:
					counterOf5++;
					break;
				case 6:
					counterOf6++;
					break;
				}
				
				
			}
			System.out.println("1 was rolled " + counterOf1 + " times");
			System.out.println("2 was rolled " + counterOf2 + " times");
			System.out.println("3 was rolled " + counterOf3 + " times");
			System.out.println("4 was rolled " + counterOf4 + " times");
			System.out.println("5 was rolled " + counterOf5 + " times");
			System.out.println("6 was rolled " + counterOf6 + " times");
			


	}

}
