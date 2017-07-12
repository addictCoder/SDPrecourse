public class EscapeSequencesComments
{
	public static void main(String[] args)
	{
		// This exercise demonstrates escape sequences & comments (like these)!
		System.out.print( "Learn\t\tJava\n\tthe\nHard\t\tWay\n\n" );
		System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
		//System.out.frimp( "Learn Java the Hard Way" );
		System.out.print( "Hello\n" ); //This line prints Hello.
		System.out.print( "Jello\by\n" ); //This line prints Jelly.
		/* The quick brown fox jumped over the lazy dog.
		   Quick wafting sephyrs vex bold Jim. */
		System.out /* testing */ .println ( "Hard to believe, eh?" );
		System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
		System.out.println( "\\ // -=- \\ //" );
		System.out.println( " \\\\ \\\\\\ \\\\\\\\" );
		System.out.print( "I hope you understand \"escape sequences\" now.\n" ); 
		// and comments :) 
	}
}
/* Placing a block comment in the middle of the word println (println method) will not compile. 
	Example: Escape SequencesComment.java:15: error: ';' expected
								System.out.print\* Block Comment *\ln( "\\ // -=- \\ //" );
																	 ^
*/