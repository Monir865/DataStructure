package dataStructure;

public class Stack {
	
	private int length  = 0;
	private int array[] = new int[20];
	
	
	public void push(int data) {
		array[length++] = data;
	}
	
	public void pop() {
		array[length] =  0;
		length--;
	}
	
	public void print() {
		for(int i=0; i<length; i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
	public int getSize() {
		return length;
	}
	
	
}
