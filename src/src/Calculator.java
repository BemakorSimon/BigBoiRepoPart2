/**
 * 
 * Area of triangle calculator
 * Insert jawn.close() to close scanner 
 */

import java.util.Scanner;
public class Calculator
{

	public static void main(String[] args) 
	{
		
		// Create a Scanner Object
		Scanner jawn = new Scanner(System.in);
		
		// print greeting
		printGreeting(jawn);
		
		// process input choice and calculate
		ChooseDeeCalculator(jawn);
       

	} // main
	private static void ChooseDeeCalculator(Scanner chooseCalculatorScan) {
		
				int calcChoice = 0;
				String calcChoiceInput = "";
				boolean quit = false;
				
		while (!quit ) {
			printIntro(); //Show and ask the user which calculator they want to use
			//Accept process input
			calcChoiceInput = chooseCalculatorScan.nextLine();
			if (calcChoiceInput.isEmpty()) { //Let the user try again if they don't enter an input
				System.out.println("That was not a valid input"); //Printing the error
			} else {
				try {
					calcChoice = Integer.parseInt(calcChoiceInput);
				} catch (Exception e) { //avoids compiler warning when the value is not an integer
					System.out.println("That was not a valid integer");
					calcChoice=999;
				}
					
				switch (calcChoice) {
					case 1:  //Calculate area of a triangle 
						triangleCalc(chooseCalculatorScan);  //Call private class triangleCalc and 
						                           //put in the scanner into triangleCalc to get 
						                           //input from user 
						quit = true; //Break the loop if the value the user put in is valid
						break ;
					case 2:  //Calculate area of a rectangle
						rectangleCalc(chooseCalculatorScan);  //Call private class rectangularCalc(Prompts and Calculates)
						quit = true; //Break the loop if the value the user put in is valid
						break ;
					case 3:
						rectangularPrismCalc(chooseCalculatorScan); //Call private class rectanglePrismCalc(Prompts and Calculates)
						quit = true; //Break the loop if the value the user put in is valid
						break ;
					case 4:
						quadraticZeroCalc(chooseCalculatorScan);
						quit = true; //Break the loop if the value the user put in is valid
						break ;
					case 0:
						//Quit
						quit=true; //Break the loop if the value the user put in is valid
						break;
					default:
						System.out.println("That was not a valid input. Please try again:/n");//Error message
				} // switch
			} //if input empty
		} //while
	} //ChooseDeeCalculator
	private static void quadraticZeroCalc(Scanner recPrismInput) {   //Argument: Let quadraticZeroCalc use scanner
		
		System.out.println("Enter a value:");
		String aInput = recPrismInput.nextLine(); 
		System.out.println("\nEnter b value: ");
		String bInput = recPrismInput.nextLine(); 
		System.out.println("\nEnter c value: ");
		String cInput = recPrismInput.nextLine();
		// Parse the string input to a new double variable
		double a = Double.parseDouble(aInput);
		double b = Double.parseDouble(bInput);
		double c = Double.parseDouble(cInput);
	    // Create and use calculator to find the 2 main sections of the equation(discriminant and divisor)
		GeometryCalculator myCalc = new GeometryCalculator();
		double divisor = myCalc.divisor(a);
		double discriminant = myCalc.discriminant(a, b, c);
		double xintercept1 = myCalc.xint1(b, discriminant, divisor);
		double xintercept2 = myCalc.xint2(b, discriminant, divisor);
		// Print result to user
		System.out.println("\nYour first zero is: " + xintercept1 + "\nYour second intercept is: " + xintercept2);
		
	} //quadraticZeroCalc
	private static void rectangularPrismCalc(Scanner recPrismInput) {   //Argument: Let RectangularPrismCalc use scanner
		
		System.out.println("Enter length value:");
		String lengthInput = recPrismInput.nextLine(); 
		System.out.println("\nEnter width value: ");
		String widthInput = recPrismInput.nextLine(); 
		System.out.println("\nEnter height value: ");
		String heightInput = recPrismInput.nextLine();
		// Parse the string input to a new double variable
		double length = Double.parseDouble(lengthInput);
		double width = Double.parseDouble(widthInput);
		double height = Double.parseDouble(heightInput);
	    // Create and use Calculator
		GeometryCalculator myCalc = new GeometryCalculator();
		double area = myCalc.calculateRectangularPrismArea(length,width,height);
	    
		// Print result to user
		System.out.println("\nArea of Rectangular Prism is, " + area);
		
	} //rectangularPrismCalc
	private static void rectangleCalc(Scanner recInput) {   //Argument: Let recInput use scanner
		
		System.out.println("Enter length value:");
		String lengthInput = recInput.nextLine(); 
		System.out.println("\nEnter width value: ");
		String widthInput = recInput.nextLine(); 
		
		// Parse the string input to a new double variable
		double length = Double.parseDouble(lengthInput);
		double width = Double.parseDouble(widthInput);

	    // Create and use Calculator
		GeometryCalculator myCalc = new GeometryCalculator();
		double area = myCalc.calculateRectangleArea(length,width);
	    
		// Print result to user
		System.out.println("\nArea of Rectangle is, " + area);
		
	} //rectangleCalc
	private static void printGreeting(Scanner s) {  //Argument: Let printGreeting use scanner
		// Get name and numbers from user
		System.out.println("Please enter your name: ");
		String name = s.nextLine(); 
		System.out.println("\n\nHello, " + name 
				+ ", welcome to Geometry Calculator!\n\nPress enter to continue...");
		s.nextLine();
		
	} // printGeeting
	
	private static void printIntro() {
		//Prompt user to ask which calculator to use
		
		System.out.println("Which calculator would you like to use? Press");
		System.out.println("\t 1 for the area of a triangle calculator");
		System.out.println("\t 2 for the area of a rectangle calculator");
		System.out.println("\t 3 for the area of a rectangular prism calculator");
		System.out.println("\t 4 for the factorization of a quadratic function calculator");
		System.out.println("\n\t 0 to Quit");
		
	} // printIntro
	
	private static void triangleCalc(Scanner triInput) { //Argument: Let triangle calc use scanner
		
		System.out.println("Enter base value:");
		String baseInput = triInput.nextLine(); 
		System.out.println("\nEnter height value: ");
		String heightInput = triInput.nextLine(); 
		
		// Parse the string input to a new double variable
		double base = Double.parseDouble(baseInput);
		double height = Double.parseDouble(heightInput);
		
	    // Create and use Calculator
	    GeometryCalculator myCalc = new GeometryCalculator();
	    double area = myCalc.calculateTriangleArea(base,height);

	    // Print result to user
	    System.out.println("\nArea of Triangle is, " + area);
	    
	} //triangleCalc
	
} //class TriangleCalc

//GeometryCalculator - Class for calculating stuff
class GeometryCalculator 
{
	//Listed vars
	double base = 0;
	double height = 0;
	double lenght = 0;
	double width = 0;
	double a = 0;
	double b = 0;
	double c = 0;
	double divisor = 0;
	double discriminant = 0;
	
	
    public double calculateTriangleArea(double base, double height) {
        return (0.5 * base) * height;
    }
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    public double calculateRectangularPrismArea(double length, double width, double height) {
    	return length * width * height;
    }
    public double discriminant (double a, double b, double c) {
    	return (b*b) - 4 * a * c; //The discriminant is the b^2 – 4ac part of the function
    }
    public double divisor (double a) {
    	return 2 * a; //The divisor is the denominator of the function 
    }
    public double xint1 (double b, double discriminant, double divisor) {
    	return -b + Math.sqrt(discriminant) / divisor;
    }
    public double xint2(double b, double discriminant, double divisor) {
    	return -b - Math.sqrt(discriminant) / divisor;
    }
}