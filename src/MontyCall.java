import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author Simon Gajewski 
 *
 * To compare strings 
 * if(answer.equals("yes"))
 *	then switch door
 */
public class MontyHall {

	// important variables
	public final static String car = "car";
	public final static String goat = "goat";
	public final static int numOfDoors = 3;
	public static String[] doors = new String[numOfDoors];
	
	
	public static void main(String[] args) 	{
		// Setup class for tracking scores of multiple runs
		scoreCount countTracker = new scoreCount();
		
		// Ask the user for which door the want to choose
		Scanner userIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How many simulations do you want to do?(10-10000)");
		int simNum = userIn.nextInt();
		userIn.nextLine();
		
		while (simNum < 10 || simNum > 10000) {
			System.out.println("That was not a valid input. Please enter a number betwween 10 and 10000");
			System.out.println("How many simulations do you want to do?(10-10000");
			simNum = userIn.nextInt();
			userIn.nextLine();
		} // while sim checker
		
		System.out.println("Do you want to switch or stay?(switch/stay)");
		String switchAnswer = userIn.nextLine();
		
		while ((!switchAnswer.equals("switch")) && (!switchAnswer.equals("stay"))) {
			System.out.println("That was not a valid input. Please try again.");
			System.out.println("Do you want to switch or stay?(switch/stay)");
			switchAnswer = userIn.nextLine();
		} // switch stay checker
		
		for (int i = 0; i < simNum; i++) {
			int userPick = rand.nextInt(3);
			userPick += 1;
			System.out.println("Bot picked the number: " + userPick);
			
			int randomDoorWithGoat= firstGamePart(userPick);
	
			System.out.println("door " + randomDoorWithGoat + " has a Goat behind it");
	
			int randNumber = 0;
			
			//If the user chose yes then change their answer to the door they did not initially pick 
			//and the door that is not chosenGoatDoor
			boolean quit = true;
			
			// convert this into secondGamePart
			while (quit) {
				if (switchAnswer.equals("switch")) {
					System.out.println("Bot switched");
					while (quit) {
						randNumber = rand.nextInt(3);
						randNumber += 1;
						//If the random number does not equal userPick and not equal opened goat door then switch
						//user pick to that door
						if (randNumber != userPick && randNumber != randomDoorWithGoat) {
							userPick = randNumber;
							decider(userPick, doors, car, countTracker);
							quit = false;
							break;
						}//if random
					}// while quit
				} else if (switchAnswer.equals("stay")) { 
					System.out.println("Bot stayed");
					decider(userPick, doors, car, countTracker);
					quit = false;
					break;
				} else {
					System.out.println("That was not a valid input");
					System.out.println("Please try again");
				} // else not valid answer
			} // while loop
		}//for loop
		
		//Final OUtputs
		double winPercent = ((double) countTracker.getWinCount()/simNum)*100;
		double losePercent = ((double) countTracker.getLoseCount()/simNum)*100;
		System.out.printf("The bot won %d times out of %d runs (%.2f)\n",countTracker.getWinCount(), simNum, winPercent);
		System.out.printf("The bot lost %d times out of %d runs (%.2f)\n",countTracker.getLoseCount(), simNum, losePercent);
		

		
		//cleanup
		userIn.close();
	} //main
	
	/***********************
	 * firstGamePart picks which doors have a goat and car behind them and decides which door to open as a goat door
	*/
	private static int firstGamePart(int doorNumber) {

		// Make a random integer variable that decides which door the car is behind
		Random rand = new Random();
		int doorPicker = rand.nextInt(3);
		doorPicker += 1;

		//Set which door has a car and which has a goat
		for(int i=1; i<=numOfDoors; i++){
			if (doorPicker == i)
				doors[i-1] = car;
			else 
				doors[i-1] = goat;
			//System.out.println("Door " + i + ": " + doors[i-1]);
		} //for
		
	
		//show a random door with goat that is not userPick
		boolean randomGoatDoor = true;
		int randNumber = 0;
		// This is going to represent the door that the program 
		// chooses to open as the goat door
		int chosenGoatDoor = 0;
		
		while (randomGoatDoor) {
			randNumber = rand.nextInt(numOfDoors);
			randNumber += 1;
			//If the random door does not have a car and is not what the user picked
			if (car.equals(doors[randNumber-1]) == false && (randNumber != doorNumber)) { 
				chosenGoatDoor = randNumber;
				//System.out.println("door " + randNumber + " has a " + doors[randNumber-1] + " behind it");
				break;			
			}//if
		}//while randomGoatDoor

		return chosenGoatDoor;
		
	} // firstGamPart
	
	
	/***********************
	*/
	private static void decider (int userPick, String[] doors, String car, scoreCount scoreTracker) {
		if (car.equals(doors[userPick-1])) {
			System.out.println("Bot Won!");
			scoreTracker.incWinCount();
			//System.out.println(scoreTracker.getWinCount());
		}
		else {
			System.out.println("Bot Lost.");
			scoreTracker.incLoseCount();
			//System.out.println(scoreTracker.getLoseCount());
		}
	} // decider
	
} //MontyCall


//* helper class for keeping count of wins and looses
class scoreCount {
	private int winCount;
	private int loseCount;
	
	public scoreCount () {
		winCount = 0;
		loseCount = 0;
	}

	public scoreCount (int wCnt, int lCnt) {
		winCount = wCnt;
		loseCount = lCnt;
	}

	//Win Counts:
	public int getWinCount() {
		return winCount;
	}
	
	public void setWinCount(int cnt) {
		winCount=cnt;
	}
	
	public void incWinCount() {
		winCount += 1;
	}
	
	//Lose counts:
	public int getLoseCount() {
		return loseCount;
	}
	
	public void setLoseCount(int lCnt) {
		loseCount=lCnt;
	}
	
	public void incLoseCount() {
		loseCount += 1;
	}

} // soreCount
