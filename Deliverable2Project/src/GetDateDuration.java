import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GetDateDuration {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two dates in this format: MM/DD/YYYY. Hit enter after each date.");

		//String input1 = input.nextLine();
		//String input2 = input.nextLine();
		String input1 = "22/30/2000";
		String input2 = "1/02/2000";
		int d1, m1, yr1, d2, m2, yr2;
		
		try {
		
			String[] dateParts = input1.split("/");
			if (Array.getLength(dateParts)!=3) {
				System.out.println("incorrect date format, must be MM/DD/YYYY");
				return;
			}
			// TODO: ensure dateParts[0] is 2 characters before turning into int
			// ... do this with the other integer fields
			d1 = Integer.parseInt(dateParts[1]);
			m1 = Integer.parseInt(dateParts[0]);
			yr1 = Integer.parseInt(dateParts[2]);
			
			dateParts = input2.split("/");
			if (Array.getLength(dateParts)!=3) {
				System.out.println("incorrect date format, must be MM/DD/YYYY");
				return;
			}
			d2 = Integer.parseInt(dateParts[1]);
			m2 = Integer.parseInt(dateParts[0]);
			yr2 = Integer.parseInt(dateParts[2]);
		} catch (Exception e) {
			System.out.println("date parts are not valid numbers");
			return;
		}
		
		//check first date if month between 01 and 12; if not, output, "Invalid month"; if yes, repeat for second date
		if ((m1 <= 0) || (m1 >= 12)) {
			System.out.println("Invalid month");
			return;
		}
		//repeat for second date
		if ((m2 <= 0) || (m2 >= 12)) {
			System.out.println("Invalid month");
			return;
		}
		
		//compute for first date: # days in input month for corresponding year
		YearMonth yearMonthObject = YearMonth.of(yr1, m1); //imported java.time
		int daysInMonth = yearMonthObject.lengthOfMonth(); //28
		System.out.println(daysInMonth);
		
		//check: for year1 and month1, is day1 valid? If no, "Invalid # of days"; If yes, repeat for second date. 
		if ((d1 <= 0) || (d1 > daysInMonth)) {
			System.out.println("Invalid number of days");
			return;
		}
		//repeat for second date
		YearMonth yearMonthObject2 = YearMonth.of(yr2, m2); //imported java.time
		int daysInMonth2 = yearMonthObject2.lengthOfMonth(); //28
		System.out.println(daysInMonth2);		
		
		if ((d2 <= 0) || (d2 > daysInMonth2)) {
			System.out.println("Invalid number of days");
			return;
		}
		
		LocalDate date1 = LocalDate.of(yr1, m1, d1);
		LocalDate date2 = LocalDate.of(yr2, m2, d2);
		
		// gives us our period object based on the 2 local dates
		Period period = Period.between(date1, date2);
		String finalYears = Integer.toString(period.getYears());
		String finalMonths = Integer.toString(period.getMonths());
		String finalDays = Integer.toString(period.getDays());
		
		// print program output to console
		System.out.print("difference years: " + finalYears + ", months: " +  finalMonths + ", days: " + finalDays);
				
		
		
		

	}
	
}
