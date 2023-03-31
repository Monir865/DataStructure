/**
 * 
 */
package controller;

import dataStructure.MyLinkedList;

public class App {
	public static void main(String [] args) {
			
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(20);
		list.removeFirstElement();
		list.add(30);
		

		list.show();
			
	}
}
