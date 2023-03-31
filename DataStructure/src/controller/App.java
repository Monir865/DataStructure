/**
 * 
 */
package controller;

import dataStructure.Stack;

public class App {
	public static void main(String [] args) {
			
		Stack s =  new Stack(); 
		s.push(10);
		s.push(20);
		s.push(30);
		
		s.print();
		System.out.println(s.getSize());
		
		s.pop();
		s.print();
		System.out.println(s.getSize());
		
		s.push(40);
		s.push(50);
		s.print();
		System.out.println(s.getSize());
		
		s.pop();
		s.print();
		System.out.println(s.getSize());
		
		
		
	}
}
