package Interfaces;

import java.util.Collection;

import dataStructure.Stack;

public interface StackFunctions {
	
	boolean add(int data);
	boolean add(int index, int data);
	boolean addAll(Collection<?> c);
	int capacity();
	void clear();
	boolean contains();
	boolean containsAll(Collection<?> c);
	void copyInto(int[] anArray);
	boolean isEmpty();
	int firstElement();
	int latstElement();
	int elementAt(int index);
	int get(int index);
	int indexOf(int data);
	boolean push(int data);
	boolean pop();
	boolean removeAll();
	boolean removeFrom(int index);
	boolean shortStack();
	Stack subStack();
	int[] toArray();
	String toString();
}
