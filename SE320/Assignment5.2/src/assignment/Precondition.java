package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Precondition {
	
	//Testing client 
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<>();
		list1.add("dog");
		list1.add("dog");
		list1.add("dog");
		list1.add("dog");
		list1.add("dog");
		list1.add("dog");
		list1.add("dog");
		list1.add("dog");
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(1);
		
		List<Integer> list3 = new ArrayList<>();
		
		removeDuplicates(list1);
		removeDuplicates(list2);
		removeDuplicates(list3);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}

	/*
	 * 
	 * Checks if there are duplicates in a list
	 * 
	 * @param lst -	list of elements,
	 * requires that duplicate values in lst be located in
	 * neighboring indexes, otherwise duplicate values will not
	 * be removed from lst.
	 * 
	 * For example, passing [1,1,1] will result in the list 
	 * being filtered to [1], while [1,2,1] will remain as
	 * [1,2,1]
	 */
	public static void removeDuplicates(List lst) 
	{ 
		if (lst == null || lst.size() == 0) return; 
		List copy = new ArrayList(lst); 
		Iterator elements = copy.iterator(); 
		Object pre = elements.next(); 
		
		while(elements.hasNext()) 
		{ 
			Object nex = elements.next(); 
			if (pre.equals(nex)) lst.remove(nex); 
			else pre = nex; 
		} 
	} 
}
