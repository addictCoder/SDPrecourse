import java.util.Scanner;

public class BMICalculatorStudyDrillOne
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		
		System.out.print( "Enter your height in inches: ");
		m = keyboard.nextDouble() * 0.025; //To convert inches to meters, multiply inches by 0.025.
		
		System.out.print( "Enter your weight in pounds: ");
		kg = keyboard.nextDouble() * 0.45; //To convert lbs to kgs, multiply lbs by 0.45.
		
		bmi = kg / (m * m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}