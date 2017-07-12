import java.util.Date;
import java.text.SimpleDateFormat;

public class FirstProg
{
	public static void main( String[] args )  //I hope this book isn't full of unnecessary white space...				
	{
		Date currentDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		String date = format.format(currentDate);		
		
		System.out.println( "I, David Cash, am determined to learn how to code." );
		System.out.println( "Today's date is " + date + "." );
	}
}