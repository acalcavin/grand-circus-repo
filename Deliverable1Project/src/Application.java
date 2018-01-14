import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doTask();
	}
	public static void doTask() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		String str1 = input.next();
		String str2 = input.next();
		
		// validate numbers have same # digits before checking anything else
		if (str1.length() != str2.length()) {
			System.out.println("Numbers must be the same length.");
			return;
		}
		int sumInt = -1;
		
		for (int i = 0; i < str1.length(); ++i) {
			char c1 = str1.charAt(i);
			if (!Character.isDigit(c1)) {
				System.out.println("Idiot!");
				return;
			}
			
			char c2 = str2.charAt(i);
			if (!Character.isDigit(c2)) {
				System.out.println("Idiot!");
				return;
			}
		 
			if (i == 0) {
				sumInt = Integer.parseInt(Character.toString(c1)) + Integer.parseInt(Character.toString(c2));
			}
			if (sumInt == Integer.parseInt(Character.toString(c1)) + Integer.parseInt(Character.toString(c2))) {

			}
			else {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
				
	}
	
}
