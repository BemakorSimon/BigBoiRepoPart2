import java.util.Scanner;

public class StringManipulator 
{

	public static void main(String[] args) 
	{
		Scanner jawn = new Scanner(System.in);
		System.out.println("Please enter any String");
		String input = jawn.nextLine();
		char firstLetter = input.charAt(0); 
		int strLength = input.length();
		char lastLetter = input.charAt(strLength - 1);
		String halfString = input.substring(0, strLength/2);
		
		

	}

}
