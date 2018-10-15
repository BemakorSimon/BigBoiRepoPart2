import java.util.Scanner;

public class GeometryCalculator 
{

	public static void main(String[] args) 
	{
		Scanner jawn = new Scanner(System.in);
		double base;
		double height; 
		System.out.println("Please enter your name: ");
		String name = jawn.nextLine(); 
		System.out.println("\n\nHello, " + name 
				+ ", welcome to Geometry Calculator!\nPlease press enter to continue...");
		jawn.nextLine();
		//https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
	}

}
