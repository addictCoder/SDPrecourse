import java.util.Scanner;

public class Sequencing 
{
	public static void main(String[] args)
	{
		// THIS CODE IS BROKEN UNTIL YOU FIX IT
		// .....fixed.
		
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;
		
		System.out.print( "How much is the purchas price? " );
		price = keyboard.nextDouble();
		
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println( "Item price:\t" + price );
		System.out.println( "Sales tax:\t" + salesTax );
		System.out.println( "Total cost:\t" + total );
	}
}	