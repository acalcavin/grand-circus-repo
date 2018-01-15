import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		doTask(); // do task in a separate method
	}
	public static void doTask() {
		Scanner input = new Scanner(System.in); // create scanner object
		System.out.println("Enter two numbers: "); // collect input from user
		String str1 = input.next();
		String str2 = input.next();
		
		// validate numbers have same # digits before checking anything else
		if (str1.length() != str2.length()) {
			System.out.println("Numbers must be the same length. Please try again.");
			return;
		}
		int sumInt = -1; //declare and initialize a variable for the sum of digits
		
		for (int i = 0; i < str1.length(); ++i) {  //use a for loop to cycle through each digit
			char c1 = str1.charAt(i);  // collect the first character of str1, to see if a digit
			if (!Character.isDigit(c1)) {
				System.out.println("Input must be a number. Please try again.");
				return;
			}
			
			char c2 = str2.charAt(i);  // repeat for str2
			if (!Character.isDigit(c2)) {
				System.out.println("Input must be a number. Give it another go.");
				return;
			}
		 
			if (i == 0) { //for the first index position, collect the sum of the characters, after conversion to string, then parse to integer
				sumInt = Integer.parseInt(Character.toString(c1)) + Integer.parseInt(Character.toString(c2));
			}
			if (sumInt == Integer.parseInt(Character.toString(c1)) + Integer.parseInt(Character.toString(c2))) { // compare each set to the first

			}
			else {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
				
	}
	
}
