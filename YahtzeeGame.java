public class YahtzeeGame
{
public static void main(String[] args)
{
Yahtzee yahtzee = new Yahtzee();
System.out.println(yahtzee.showDice());
System.out.println(" Ones: " + yahtzee.getScoreOnes());
System.out.println(" Twos: " + yahtzee.getScoreTwos());
System.out.println(" Threes: " + yahtzee.getScoreThrees());
System.out.println(" Fours: " + yahtzee.getScoreFours());
System.out.println(" Fives: " + yahtzee.getScoreFives());
System.out.println(" Sixes: " + yahtzee.getScoreSixes());

}
}