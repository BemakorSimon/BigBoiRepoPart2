import java.util.Scanner;

public class mealReceipt {

	public static void main(String[] args) {
		
		Scanner jawn = new Scanner(System.in);
		System.out.println("Welcome to the tax and tip calcuator");
		System.out.println("Press enter to continue");
		jawn.nextLine();
		System.out.println("Please enter the name of your appetizer: ");
		String appetizerName = jawn.nextLine();
		System.out.println("Please enter the price of your appetizer: ");
		String appetizerPrice = jawn.nextLine();
		System.out.println("Please enter the name of your entrée: ");
		String entréeName = jawn.nextLine();
		System.out.println("Please enter the price of your entrée: ");
		String entréePrice = jawn.nextLine();
		System.out.println("Please enter the name of your dessert: ");
		String dessertName = jawn.nextLine();
		System.out.println("Please enter the price of your dessert: ");
		String dessertPrice = jawn.nextLine();
		System.out.println("Please enter the percent Tip you would like to give: ");
		String tip = jawn.nextLine();
		//Parse everything
		Double appetizerPriceNum = Double.parseDouble(appetizerPrice);
		Double entréePriceNum = Double.parseDouble(entréePrice);
		Double dessertPriceNum = Double.parseDouble(dessertPrice);
		Double tipNum = Double.parseDouble(tip);
		
		Double totalBeforeTax = appetizerPriceNum + entréePriceNum + dessertPriceNum; //Find total
		Double tipMultiply = tipNum * totalBeforeTax;
		Double totalAfterTaxPlusTip = totalBeforeTax * 1.06 + tipMultiply; 
		
		
		
		
		
		
		
		
	}
	
	
	
}
