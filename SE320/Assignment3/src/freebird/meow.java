package freebird;

import java.util.ArrayList;

public class meow {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(1, 4);
		list.set(2, 30);
		
		System.out.println(list);
	}
}
