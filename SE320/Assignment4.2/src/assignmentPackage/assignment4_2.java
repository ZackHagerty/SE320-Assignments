package assignmentPackage;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class assignment4_2 
{
	
	public static void main(String[] args) throws Exception
	{
		Set<String> tree = new TreeSet<String>();
		
		try {
			File file = new File("assets/test.txt");
			Scanner input = new Scanner(file);
		
			int i=0;
			while(input.hasNext()) 
			{
				
			String word = input.next();
			tree.add(word);
			i = i + 1 ;
			}
			input.close();
		}
		catch(Exception e)
		{
			System.out.println("File URL is incorrect");
		}
		//Tree Set automatically deletes duplicates and sorts in ascending order
		System.out.println(tree);
		
	}
}

