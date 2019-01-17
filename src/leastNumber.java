import java.util.Scanner;
//Simon Gajewski made this in class when sub was here
public class leastNumber {
	public static void main (String[] args) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter first double:");
		double double1 = userIn.nextDouble();
		userIn.nextLine();
		System.out.println("Please enter second double:");
		double double2 = userIn.nextDouble();
		userIn.nextLine();
		System.out.println("Please enter thrid double:");
		double double3 = userIn.nextDouble();
		userIn.nextLine();
		System.out.println("The lowest number is " + decider(double1, double2, double3));
	}
	public static double decider (double double12, double double13, double double14) {
		double double1 = 0;
		if (double12 < double13 && double12 < double13) {
			double1 = double12;
		}
		else if (double13 < double12 && double13 < double14) {
			double1 = double13;
		}
		else if (double14 < double12 && double14 < double13) {
			double1 = double14;
		}
		else if (double12 == double13) {
			System.out.println("First double is equal to second double");
		}
		else if (double13 == double14) {
			System.out.println("Second double is equal to third double");
		}
		else if (double14 == double12) {
			System.out.println("First double is equal to third double");
		}
		else {
			System.out.println("Something didnt work.");
		}
		return double1;
	}
}//leastNumber
