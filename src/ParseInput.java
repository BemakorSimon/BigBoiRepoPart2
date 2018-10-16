import java.util.Scanner;


//*******
//
// ParseInput - processes input from user and calls Geometry Calculator
//
public class ParseInput 
{

	public static void main(String[] args) 
	{
		// Create a Scanner Object
		Scanner jawn = new Scanner(System.in);
		
		// Get name and numbers from user
		System.out.println("Please enter your name: ");
		String name = jawn.nextLine(); 
		System.out.println("\n\nHello, " + name 
				+ ", welcome to Geometry Calculator!\n\nEnter base value: ");
		String base = jawn.nextLine(); 
		System.out.println("\nEnter height value: ");
		String height = jawn.nextLine(); 
        
        // Create a Calculator
        GeometryCalculator myCalc = new GeometryCalculator();
        double area = myCalc.calculateTriangleArea(Double.parseDouble(base),Double.parseDouble(height));

        // Print result to user
        System.out.println("\nArea of Triangle is, " + area); 

        area = myCalc.calculateRectangleArea(Double.parseDouble(base),Double.parseDouble(height));
        System.out.println("\nArea of Rectangle is, " + area); 

	}

}
//**********
//
// GeometryCalculator - just calculates an area given 2 values
//
class GeometryCalculator 
{
    double base;
    double height;
    
    GeometryCalculator() {
        base=0;
        height=0;
    }
    public double calculateTriangleArea(double base, double height) {
        return (0.5 * base) * height;
    }
    public double calculateRectangleArea(double base, double height) {
        return base * height;
    }
    
}

