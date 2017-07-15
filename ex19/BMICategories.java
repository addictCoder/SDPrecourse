import java.util.Scanner;

public class BMICategories
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double bmi, m, kg;
		
		System.out.print( "Enter your height in inches: ");
		m = keyboard.nextDouble() * 0.025;
		
		System.out.print( "Enter your weight in pounds: ");
		kg = keyboard.nextDouble() * 0.45;
		
		bmi = kg / (m * m);
		
		System.out.println("BMI category");
		if(bmi < 15.0)
		{
			System.out.println("very severely underweight");
		}
		else if(bmi <= 16.0)
		{
			System.out.println("severely underweight");
		}
		else if(bmi < 18.5)
		{
			System.out.println("underweight");
		}
		if(bmi < 25.0) //STUDY DRILL Remove the "else"
		{
			System.out.println("normal underweight");
		}
		else if(bmi < 30.0)
		{
			System.out.println("overweight");
		}
		else if(bmi < 35.0)
		{
			System.out.println("moderately obese");
		}
		else if(bmi < 40.0)
		{
			System.out.println("severely obese");
		}
		else
		{
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}