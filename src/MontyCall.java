import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author Simon Gajewski 
 *
 *To compare strings 
 *if(answer.equals("yes"))
 *	then switch door
 */
public class MontyCall 
{
	public static void main(String[] args) 
	{
		//important variables
		 final String car = "car";
		 final String goat = "goat";
		int numOfDoors = 3;
		String[] doors = new String[numOfDoors-1];
		
		
		//Make a random integer variable that decides which door the car is behind
		Random rand = new Random();
		int doorPicker = rand.nextInt(3);
		doorPicker += 1;

      System.out.println("before for");
		
		//Define which door has a car and which has a goat
		for (int i=1; i==numOfDoors; i++) {
          System.out.println("in for");
			if (doorPicker == i)
				doors[i-1] = car;
			else 
				doors[i-1] = goat;
			System.out.println("Door " + i + ": " + doors[i-1]);
		} //for
		
		
		//Ask the user for which door the want to choose
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter which door you would like to open (1, 2, or 3)");
		int userPick = userIn.nextInt();
		userIn.nextLine();
	} //main
} //MontyCall
