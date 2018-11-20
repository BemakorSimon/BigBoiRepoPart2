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
		String door1 = "null";
		String door2 = "null";
		String door3 = "null";
		String static car = "car";
		String static goat = "goat";
		int numOfDoors = 3;
		String[] doors = new String[numOfDoors-1];
		
		
		//Make a random integer variable that decides which door the car is behind
		Random rand = new Random();
		int doorPicker = rand.nextInt(3);
		doorPicker += 1;
		
		//Define which door has a car and which has a goat
		for(int i=1; i=numOfDoors; i++) {
			if (doorPicker == i)
				door[i-1] = car;
			else 
				door[i-1] = goat;
			System.out.print("Door " + i + ": " + door[i-1]);
		} //for
		
		
		//Ask the user for which door the want to choose
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter which door you would like to open (1, 2, or 3)");
		int userPick = userIn.nextInt();
		userIn.nextLine();
	}
}
