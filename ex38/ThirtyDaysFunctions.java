import java.util.Scanner;

/**
 * Contains funtions that make it easier to work with months.
 */
 
public class ThirtyDaysFunctions
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Which month? (1-12) ");
		int month = kb.nextInt();
		
		System.out.println(monthDays(month) + " days hath " + monthName(month));
	}
	
	/**
	 * Returns the name for the given month number (1-12).
	 *
	 * @author Graham Mitchell
	 * @param	month	the month number (1-12)
	 * @return			the English name of the month, or "error" if out of range
	 */
	public static String monthName(int month)
	{
		String monthName = "error";
		
		if (month == 1)
			monthName = "January";
		if (month == 2)
			monthName = "February";
		if (month == 3)
			monthName = "March";
		if (month == 4)
			monthName = "April";
		if (month == 5)
			monthName = "May";
		if (month == 6)
			monthName = "June";
		if (month == 7)
			monthName = "July";
		if (month == 8)
			monthName = "August";
		if (month == 9)
			monthName = "September";
		if (month == 10)
			monthName = "October";
		if (month == 11)
			monthName = "November";
		if (month == 12)
			monthName = "December";
		
		return monthName;
	}
	
	/**
	 * Returns the number of days in a given month.
	 *
	 * @author Graham Mitchell
	 * @param	month	the month number (1-12)
	 * @return			the number of days in the month, or 31 if out of range
	 */
	public static int monthDays(int month)
	{
		int days;
		
		/* April, June, Sep, Nov have 30 days
		   Feb has 28
		   The rest have 30 */
		   
		switch (month)
		{
			case  4:
			case  6:
			case  9:
			case 11: days = 30;
					 break;
			case  2: days = 28;
					 break;
			default: days = 31;
		}
		return days;
	}

}