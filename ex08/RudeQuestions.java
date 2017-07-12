import java.util.Scanner;
import java.util.InputMismatchException;

public class RudeQuestions
{
	public static void main(String[] args)
	{
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age +  ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully, that is  " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		// Study Drills #4
		
		int answer = 0;
		while(answer != 1)
		{
			try 
			{
				System.out.println("What is 7 % 3?");
				answer = keyboard.nextInt();
			} catch (InputMismatchException e) {
				keyboard.next();
			}
				
			if (answer == 1)
			{
				System.out.println("\nGood job!");
			} else {
				System.out.println("\nNope. Try again, Dummy.");
			}
		}

	}
	
	/*	Study Drills:
		
		1. The program will not "Blow Up" if the user enters and int when the code is asking for a double. The program will take the whole number entered and store
			it as a floating point number.
				ex. If you enter 4 when it's calling for a double, it will store 4 as 4.0.
				
		2. The program will not "Blow Up" if the user enters an int, double, float, long, etc. when to code is asking for a string. It will store the user's input
			as a string. 
				ex. If you enter 691.03 when it's calling for a string, it will store your input as "691.03".
				
		3. Ok, I'll start with how to throw a InputMismatchException with questions 2-4 first, then explain how to throw it on question 1.
			For question 2, the code asks for an integer(int). So of course, typing in letters will cause the program to "Blow Up." Also, if you enter a decimal
			number, it will "Blow Up". This is because int is asking for a whole number and cannot store a decimal number.
			For questions 3 and 4, they both ask for a double. So, just type in any number. It can have a decimal point. Just don't add any letters.
			Now on to question 1. It's asking for a string, so anything you type will be stored as a string without a problem. "David", "16593728", 
			"12hdif.38%\t3820_883" and so on. However, if you input for first name and last name separated with a space, you will receive an InputMismatchException.
			This is because the Scanner object named keyboard is calling the next() method and is looking for the next string value. Because your first and last 
			names are separated by a space, the next() will only read the first token, your first name. 
				"But if my first name is a string, then why am I getting the InputMismatchException?"
				Well, this is because the InputMismatchException isn't actually being thrown on the first question. The next() method takes your first name and assigns
				that value to the String name. Then the program continues. It will print the next println() method, THEN throw the InputMismatchException. This is because
				the keyboard object is now calling the nextInt() method. However, it reads your last name and the next token. int != String. 
				
		4.

		*/	
	
}