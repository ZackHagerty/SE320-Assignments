package assignment2Package;

public class TestClient {

	public static void main(String[] args)
	{
		GenericStack<Integer> defaultStack = new GenericStack<>();
		
		System.out.println("Default Stack testing");
		System.out.println("Current Size: " + defaultStack.getSize());
		System.out.println("Peek: " + defaultStack.peek());
		System.out.println("Is Empty: " + defaultStack.isEmpty());
		System.out.println(defaultStack.toString());
		
		System.out.println("Populating array with values 0-9");
		for(int i=0; i< 10; i++)
		{
			defaultStack.push(i);
		}
		
		System.out.println(defaultStack.toString());
		System.out.println("Current Size: " + defaultStack.getSize());
		System.out.println("Peek: " + defaultStack.peek());
		System.out.println("Is Empty: " + defaultStack.isEmpty());
		
		System.out.println("Adding values to array, expanding size");
		for(int i=0; i< 5; i++)
		{
			defaultStack.push(i);
		}
		
		System.out.println("Current Size: " + defaultStack.getSize());
		System.out.println("Peek: " + defaultStack.peek());
		System.out.println("Is Empty: " + defaultStack.isEmpty());
		
		
		System.out.println("Array before popping out: " + defaultStack.toString());
		
		for(int i=0; i < 16; i++)
		{
			System.out.println("Popping: " + defaultStack.pop());
		}
		
		System.out.println("Is Empty: " + defaultStack.isEmpty());
		System.out.println("Final array: " + defaultStack.toString());
		System.out.println("Current Size: " + defaultStack.getSize() + "\n\n\n");
		
		
		GenericStack<Integer> customStack = new GenericStack<>(15);
		
		System.out.println("Custom Stack testing");
		System.out.println("Current Size: " + customStack .getSize());
		System.out.println("Peek: " + customStack .peek());
		System.out.println("Is Empty: " + customStack.isEmpty());
		System.out.println(customStack.toString());
		
		System.out.println("Populating array with values 0-14");
		for(int i=0; i < 15; i++)
		{
			customStack.push(i);
		}
		
		System.out.println(customStack.toString());
		System.out.println("Current Size: " + customStack.getSize());
		System.out.println("Peek: " + customStack.peek());
		System.out.println("Is Empty: " + customStack.isEmpty());
		
		System.out.println("Adding values to array, expanding size");
		for(int i=0; i< 15; i++)
		{
			customStack.push(i);
		}
		
		System.out.println("Current Size: " + customStack.getSize());
		System.out.println("Peek: " + customStack.peek());
		System.out.println("Is Empty: " + customStack.isEmpty());
		
		
		System.out.println("Array before popping out: " + customStack.toString());
		
		for(int i=0; i < 30; i++)
		{
			System.out.println("Popping: " + customStack.pop());
		}
		
		System.out.println("Is Empty: " + customStack.isEmpty());
		System.out.println("Final array: " + customStack.toString());
		System.out.println("Current Size: " + customStack.getSize());
		
	}
	
}
