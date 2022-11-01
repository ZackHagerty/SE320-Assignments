package assignmentPackage;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment4_1 {

	
	static void findUnion(Set setOne, Set setTwo)
	{
		Set copyOne = new LinkedHashSet(setOne);
		Set copyTwo = new LinkedHashSet(setTwo);
		
		copyOne.addAll(copyTwo);
		
		System.out.println("Union of Hash Sets: " + copyOne);
	}
	
	static void findDifference(Set setOne, Set setTwo)
	{
		Set copyOne = new LinkedHashSet(setOne);
		Set copyTwo = new LinkedHashSet(setTwo);
		
		copyOne.removeAll(copyTwo);
		
		System.out.println("Difference of Hash Sets (SetOne - SetTwo): " + copyOne);
		
	}
	
	static void findIntersection(Set setOne, Set setTwo)
	{
		Set copyOne = new LinkedHashSet(setOne);
		Set copyTwo = new LinkedHashSet(setTwo);
		
		copyOne.retainAll(copyTwo);
		
		System.out.println("Intersection of Hash Sets: " + copyOne);
	}
	
	public static void main(String[] args)
	{
		LinkedHashSet<String> setOne = new LinkedHashSet<String>();
		LinkedHashSet<String> setTwo = new LinkedHashSet<String>();
		
		setOne.add("George");
		setOne.add("Jim");
		setOne.add("John");
		setOne.add("Blake");
		setOne.add("Kevin");
		setOne.add("Michael");
		
		System.out.println("Set One: " + setOne);
		
		setTwo.add("George");
		setTwo.add("Katie");
		setTwo.add("Kevin");
		setTwo.add("Michelle");
		setTwo.add("Ryan");
		
		System.out.println("Set Two: " + setTwo);
		
		findUnion(setOne, setTwo);
		findDifference(setOne, setTwo);
		findIntersection(setOne, setTwo);
	}
}
