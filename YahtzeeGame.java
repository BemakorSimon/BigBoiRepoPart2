import java.util.*;
public class YahtzeeGame
{
public static void main(String[] args)
{
Yahtzee yahtzee = new Yahtzee();
Scanner jawn = new Scanner(System.in);
System.out.println(yahtzee.showDice());
System.out.println(yahtzee.getScoreCard());
System.out.println("Enter die number(s) to keep (separated by a space):");
String input = jawn.nextLine();

if (!(input.contains("1")))
	yahtzee.rollADie(1);
else if (!(input.contains("2")))
	yahtzee.rollADie(2);
else if (!(input.contains("3")))
	yahtzee.rollADie(3);
else if (!(input.contains("4")))
	yahtzee.rollADie(4);
else if (!(input.contains("5")))
	yahtzee.rollADie(5);

System.out.println(yahtzee.showDice());
}
}