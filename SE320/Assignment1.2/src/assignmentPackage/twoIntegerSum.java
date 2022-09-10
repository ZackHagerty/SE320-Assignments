package assignmentPackage;
import java.util.*;

public class twoIntegerSum {
	
	
	public static void main(String[] args) {
		
		boolean continueInput = true;
		int number1 = 0;
		int number2 = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);	
		
		do {
			try {
				System.out.print("Enter two integers separated by spaces: ");
				number1 = input.nextInt();
				number2 = input.nextInt();
				
				sum = number1 + number2;
				
				System.out.println("The sum of the numbers entered is " + sum + "\n\n");
			
				continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("\n \nTry again .(" +
						"Incorrect input: two integers separated by spaces are required)\n");
				input.nextLine();
			}
		} while(continueInput);

	}
}
