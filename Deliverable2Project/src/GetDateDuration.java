import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GetDateDuration {

	public static void main(String[] args) throws ParseException {
	    
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		
		// TODO: create scanner, input date string, validate
		
		Scanner input = new Scanner(System.in);
		
		//Get input 
		System.out.println("Please enter two dates: YYYY MM DD ");
		year1 = input.nextInt();
		System.out.println("Year is: " + year1);
		month1 = input.nextInt();
		day1 = input.nextInt();
		System.out.println("Month is: " + month1);
		
		
		
		/*
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();

	    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

	    Date date1 = sdf.parse("your first date");
	    cal1.setTime(date)
	    Date date2 = sdf.parse("your second date");
	    cal2.setTime(date);
	    
	    date1.compareTo(date2) // 0 if equal, less than 0 if date1 is before, gt 0 if date1 is after
	     
	    date1.getDay()
	    
	    cal1.getActualMaximum(arg0)
	    
	    */
	}
	

}
