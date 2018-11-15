import java.util.Scanner;
/**
 * 
 * @author Simon Gajewski
 *
 */
public class WhichSeason {

	public static void main(String[] args) 
	{
		Scanner userIn = new Scanner(System.in);
		boolean run = true;
		while (run == true)
		{
			System.out.println("Please enter your birthmonth's number:");
			int month = userIn.nextInt();
			userIn.nextLine();
			if ((month < 1)|| (month > 12)) 
			{
				System.out.println("That is an invalid month");
			}
			if ((month >= 3) && (month <= 5))
			{
				System.out.println("Your birthday is in the spring");
			}
			if ((month >= 6) && (month <= 8))
			{
				System.out.println("Your birthday is in the summer");
			}
			if ((month >= 9) && (month <= 11))
			{
				System.out.println("Your birthday is in the fall");
			}
			if ((month == 12) || ((month >= 1) && (month <= 2)))
			{
				System.out.println("Your birthday is in the winter");
			}
		}//while
	}

}
