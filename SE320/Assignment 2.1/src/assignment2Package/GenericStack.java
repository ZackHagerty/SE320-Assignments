package assignment2Package;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericStack<E> {
	
	private E[] array;
	private int capacity = 10;
	private int size= 0;
	
	public GenericStack(int capacity)
	{
		this.capacity = capacity;
		this.array = (E[]) new Object[this.capacity];
	}
	
	public GenericStack()
	{
		//Default Array-list capacity is typically 10 so this project utilizes 10 
		//as "default" capacity for equivalent array-based stack
		this.array = (E[]) new Object[this.capacity];
	}
	
	public int getSize() {
		return size;
	}
	
	public E peek() {
		if( size == 0) return null;
		return this.array[getSize() - 1];
	}
	
	public void push(E o) {
		array[size] = o;
		
		size++;
		
		if(size == capacity)
		{
			E[] expandedArray = (E[]) new Object[this.capacity * 2];
			System.arraycopy(this.array, 0, expandedArray, 0, this.array.length);
			this.array = expandedArray;
		}
	}
	
	public E pop() {
		
		if(this.array.length == 0 ) return null;
		size--;
		E pop = this.array[getSize()];
		
		this.array = Arrays.copyOf(this.array, getSize());
		return pop;

	}
	
	public boolean isEmpty() {
		if (this.array.length == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString() {
		 return "stack: " + Arrays.toString(this.array);
	}
}

