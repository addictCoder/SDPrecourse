import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ready;
		
		System.out.print("Are you ready? ");
		ready = keyboard.nextLine();
		
		while(!ready.equals("Yes!"))
		{
			System.out.println("You must type \"Yes!\" to continue...");
			System.out.print("Are you ready? ");
			ready = keyboard.nextLine();
		}
		
		System.out.print("Give me a number and I'll find it's square root. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();
		
		while(x < 0)
		{
			System.out.println("I won't take the square root of a negative.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();			
		}
		
		y = Math.sqrt(x);
		
		System.out.println("The Square root of " + x + " is " + y + ".");
	}
}