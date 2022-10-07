package assignment2package;
import java.util.ArrayList; 

public class Exercise19_03 {
	public static void main(String[] args) { 
	    ArrayList<Integer> list = new ArrayList<Integer>(); 
	    list.add(14); 
	    list.add(24); 
	    list.add(14); 
	    list.add(42); 
	    list.add(25); 
	     
	    ArrayList<Integer> newList = removeDuplicates(list); 
	     
	    System.out.print(newList); 
	  } 
	 
	 public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){ 
	 
		 ArrayList<E> list2 = new ArrayList<E>();
		 
		 for (E elem: list)
			 if(!list2.contains(elem))
			 {
				 list2.add(elem);
			 }
		return list2;
			 
	  } 
	}
