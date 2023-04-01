package dataStructure;

import java.util.Collection;

import Interfaces.StackFunctions;

public class Stack implements StackFunctions{
	
	private int length  = 0;
	private int array[] = new int[20];

	
	public void print() {
		for(int i=0; i<length; i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
	public int getSize() {
		return length;
	}

	@Override
	public boolean add(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(int index, int data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void copyInto(int[] anArray) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int firstElement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int latstElement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int elementAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int get(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int indexOf(int data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean push(int data) {
		array[length++] = data;
		return true;
	}

	@Override
	public boolean pop() {
		array[length] =  0;
		length--;
		return true;
	}

	@Override
	public boolean removeAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFrom(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shortStack() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Stack subStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
