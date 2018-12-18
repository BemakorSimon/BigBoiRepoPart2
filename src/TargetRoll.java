import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Simon Gajewski
 *
 */
public class TargetRoll {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Random rand = new Random();
					
			System.out.println("Please enter a number between 1-6:");
			int userIn = input.nextInt();
			input.nextLine();
			while (userIn < 1 || userIn > 6) {
				System.out.println("That was not a valid input dummy");
				System.out.println("Follow the directions this time and input a number between 1 and 6:");
				userIn = input.nextInt();
				input.nextLine();
			}//validator while
			int counter = 0;
			int randomNum = 0;
			System.out.println("Press enter to roll");
			while (randomNum != userIn) {
				input.nextLine();
				randomNum = rand.nextInt(6) + 1;
				System.out.println("you rolled a " + randomNum);
				counter++;
				
			}
			System.out.println("Yout rolled your taget number!");
			System.out.println("It took " + counter + " tries");


	}

}
