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
		
		Random rand = new Random();
		int doorPicker = rand.nextInt(3);
		doorPicker += 1;
		
		if (doorPicker == 1)
		{
			door1 = "car";
		}
		else if (doorPicker != 1)
		{
			door1 = "goat";
		}
		
		if (doorPicker == 2)
		{
			door2 = "car";
		}
		else if (doorPicker != 2)
		{
			door2 = "goat";
		}
		
		if (doorPicker == 3)
		{
			door3 = "car";
		}
		else if (doorPicker != 3)
		{
			door3 = "goat";
		}
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter which door you would like to open (1, 2, or 3)");
		int userPick = userIn.nextInt();
		userIn.nextLine();
		if (doorPicker == userPick) 
		{
			System.out.println("Congradulations! You picked the car");
		}
	}
}
