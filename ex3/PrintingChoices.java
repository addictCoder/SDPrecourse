public class PrintingChoices
{
	public static void main(String[] args)
	{
		String[] str = {"I", "am", "learning", "Java", "the", "Hard", "Way"};
		System.out.println( "Alpha" );
		System.out.println( "Bravo" );
		
		System.out.println( "Charlie" );
		System.out.println( "Delta" );
		System.out.println();
		
		System.out.print( "Echo" );
		System.out.print( "Foxtrot" );
		
		System.out.println( "Golf" );
		System.out.print( "Hotel" );
		System.out.println();
		System.out.println( "India" );
		
		System.out.println();
		System.out.println( "This" + " " + "is" + " " + "a" + " " + "test." );	
		
		System.out.printf("%s %s" + " " + "%s %s" + " " + "%s %s %s.\n", str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
	}
}