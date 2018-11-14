import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BirthdayCalculator {

	public static void main(String[] args) 
	{
		Scanner userIn = new Scanner(System.in);
		System.out.println("What is person 1's name: ");
		String name1 = userIn.nextLine();
		System.out.println("What is person 1's birthday? (Type year (yyyy) then press enter, then type month (mm), then type day (dd)");
		int year1 = userIn.nextInt();
		int month1 = userIn.nextInt();
		int day1 = userIn.nextInt();
		System.out.println("What is person 2's name: ");
		String name2 = userIn.nextLine();
		System.out.println("What is person 2's birthday? (Type year (yyyy) then press enter, then type month (mm) then enter, then type day (dd) then enter");
		int year2 = userIn.nextInt();
		int month2 = userIn.nextInt();
		int day2 = userIn.nextInt();
		userIn.close();
		// initialize two calendars
	      Calendar person1 = new GregorianCalendar(year1,month1,day1);
	      Calendar person2 = new GregorianCalendar(year2,month2,day2);

	      // compare dates
	      if((person1.compareTo(person2)) < 0)
	      {
	         System.out.println(name1 + " is younger than " + name2);
	      }
	      else if((person2.compareTo(person1)) < 0)
	      {
	         System.out.println(name1 + " is older than " + name2);
	      }
	      else
	      {
	    	  System.out.println("They have the same birthday");
	      }//else  
	   }//main	
	}//BirthdayCalculator
