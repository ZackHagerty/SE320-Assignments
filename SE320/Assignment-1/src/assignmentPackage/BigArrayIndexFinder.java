package assignmentPackage;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BigArrayIndexFinder {
	public static void main(String[] args) {
			
		int[] array = new int[100]; 
		int max = 100000;
		int min = 1;
		
		Scanner input = new Scanner(System.in);	
		int chosenIndex;
		
		
		for (int i=0; i< array.length; i++)
		{
			array[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
		}
		
		try {
			System.out.print("Enter index: ");
			chosenIndex = input.nextInt();
				
			System.out.println("The value at the chosen index is " + array[chosenIndex] + "\n\n");
			
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("\n \nOut of Bounds\n");
				input.nextLine();
			}
		catch (InputMismatchException ex) {
				System.out.println("\n \nInvalid Input.\n");
				input.nextLine();
		}

	}
}
