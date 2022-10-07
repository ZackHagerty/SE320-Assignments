package assignment23;
import java.util.Scanner;

public class Assignment2_3 {
	public static void main(String[] args) {
		
		int max = 10;
		int min = 0;
		float chosenNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 0 and 10: ");
		chosenNumber = input.nextFloat();
		
		assert chosenNumber >= 0 && chosenNumber <=10 : "The entered number is out of range";
				
		
	}
}
