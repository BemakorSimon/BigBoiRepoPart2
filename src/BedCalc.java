

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * 
 * @author Simon Gajewski
 * This website explains the calendar stuff pretty well
 *https://beginnersbook.com/2013/05/java-calendar-class/
 *
 */
public class BedCalc {

		   public static void main(String[] args) 
		   {
			   System.out.println("To enter the times follow the directions\nEx) If I wanted to enter the date 3rd day of the month at 6:34 PM\n "
			   		+ "I would say \nDAY OF MONTH IS: 3 \nHOUR IS:6\nMINUTE IS: 34\n Those arent the exact prompts but you should get the idea"
			   		+ "\nPM and AM is assumed based on wether you are putting in the wake up time or the sleep time\n\n\n");
			  Scanner userIn = new Scanner(System.in);
		      //ask for the users time they want to go to sleep
		      System.out.println("Please enter the day of the month you plan to go to sleep");
		      int nowDay = userIn.nextInt();
		      System.out.println("Please enter the hour you want to go to sleep");
		      int nowHour = userIn.nextInt();
		      System.out.println("Please enter the minute you would like to go to sleep(type 0 for Oclock i.e. 9:00 or 10:00)");
		      int nowMin = userIn.nextInt();
		      //ask for the users time they are planning to wake up
		      System.out.println("Please enter the day of the month you plan to wake up");
		      int laterDay = userIn.nextInt();
		      System.out.println("Please enter the hour you plan to wake up");
		      int laterHour = userIn.nextInt();
		      System.out.println("Please enter the minute you plan to wake up(type 0 if you dont care what minute)");
		      int laterMin = userIn.nextInt();
		      userIn.close();//It closes the scanner and Gets rid of the annoying "your scanner is not closed" message
		      BedCalc difference = new BedCalc();
		      difference.subTime(nowDay, nowHour, nowMin, laterDay, laterHour, laterMin);
		   }//main

		   public void subTime(int nowDay, int nowHour, int nowMin, int laterDay, int laterHour, int laterMin) 
		   {
			   //Making the different calendars. I put in a random year and month because it wants it but its not needed
			   Calendar timeIWantToGoToSleep = new GregorianCalendar(2018,Calendar.MARCH,nowDay, nowHour,nowMin);
			   timeIWantToGoToSleep.set( Calendar.AM_PM, Calendar.PM ); // This makes the time permanantly PM. 
			   //It is assumed that the user will be falling asleep in the pm hours. If not, they need help and shouldn't be using this program
			   
			   //Making the calendar that the program can touch and is used for math and stuff
			   Calendar timeIWantToGoToWakeUp = new GregorianCalendar(2018,Calendar.MARCH,laterDay, laterHour,laterMin);
			   timeIWantToGoToWakeUp.set( Calendar.AM_PM, Calendar.AM );//Assumes the user is waking up in the morning...
			   //making the calendar that the program does not touch so i can post it at the end
			   Calendar untouchedTimeIWantToGoToWakeUp = new GregorianCalendar(2018,Calendar.MARCH,laterDay, laterHour,laterMin);
			   timeIWantToGoToWakeUp.set( Calendar.AM_PM, Calendar.AM );
			   
			   int numberOfLoops = 0;//Im using this variable to measure how many times the program loops to find the amount of sleep cycles
			   while ((timeIWantToGoToSleep.compareTo(timeIWantToGoToWakeUp)) < 0) //When the time to wake up is after the time wanted to fall asleep it keeps going
			   {
				   timeIWantToGoToWakeUp.add(Calendar.HOUR, -1);//subtracts an hour and a half 
				   timeIWantToGoToWakeUp.add(Calendar.MINUTE, -30);
				   numberOfLoops += 1;//Adds one to the loop counter, i know i can use the i++ thing but i dont feel like it
			   }//End of while
		      System.out.println("");
		      
		      numberOfLoops -= 1;//You got to subtract one because of how the while statement works
		      timeIWantToGoToWakeUp.add(Calendar.HOUR, 1);//Adds an hour and a half because of the way my while statement works
		      timeIWantToGoToWakeUp.add(Calendar.MINUTE, 30);
		      
		      SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aaa");//sets the format for what you want the date to look like
		      
		      //Printing the stuff
		      System.out.println("The number of sleep cycles you would go through is:" + numberOfLoops);//tells the user the sleep cycles
		      String goToSleepdate = sdf.format(timeIWantToGoToWakeUp.getTime());
		      String WantToSleepdate = sdf.format(timeIWantToGoToSleep.getTime());
		      String WantToWakeDate = sdf.format(untouchedTimeIWantToGoToWakeUp.getTime());
		      System.out.println("The time you should go to sleep is: " + goToSleepdate);
		      System.out.println("The time you want to go to sleep is: " + WantToSleepdate);
		      System.out.println("The time you wanted to wake up is: " + WantToWakeDate);
		     
		   }//subTime
}//BedCalc

