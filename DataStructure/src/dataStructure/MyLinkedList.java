package dataStructure;


public class MyLinkedList {
	
	Node head;
	int size = 0;
	
	public void add(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = toAdd;
	}
	
	
	public void addToFirst(int data) {
		Node toAdd = new Node(data);	
		Node temp = head;
		head = toAdd;
		head.next = temp;
	}
	
	
	public void addToPosition(int data, int position) {
		Node toAdd = new Node(data);
		Node current = head;
		Node pre = null;
		
		if(isEmpty()) {
			return;
		}
		
		int count = 1;	
		try {
			while(count < position) {
				pre = current;
				current = current.next;
				count++;
			}
		}catch(Exception e) {
			System.out.println("Index out of bounds!");
		}
		
		pre.next = toAdd;
		//pre.next.next = current;
		toAdd.next = current;
		
	}
	
	
	public void removeToPosition(int position) {
		Node current = head;
		Node pre = null;
		
		if(isEmpty() || head.next == null) {
			head = null;
			return;
		}
		
		int count = 1;
		
		while(count < position) {
			pre = current;
			current = current.next;
			count++;
		}
		
		pre.next = current.next;
		
	}
	
	
	public void removeFirstElement() {
		if(isEmpty()) {
			return;
		}
		head = head.next;
	}
	
	public void removeLastElement() {
		Node previous = null;
		Node current = head;
		
		if(isEmpty() || head.next == null) {
			head = null;
			return;
		}
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		
		previous.next = current.next;
	}
	
	public void removeAll() {	
		this.head = null;	
		size = 0;
	}
	
	
	public void replaceByPosition(int data, int position) {
		Node temp = head;
		
		if(isEmpty()) {
			return;
		}
		int count = 1; 
		while(position > count) {
			temp = temp.next;
			count++;
		}
		
		temp.data = data;		
	}
	

	public void reverse() {
		Node current  = head;
		Node pre = null;

		while(current != null) {
			Node temp = current.next;
			current.next = pre;
			pre = current;
			current = temp;
		}
		
		head = pre;
	}
	
	public void sort() {

		Node cur = head;
		Node temp = null;
		Node pre = null;
		
		while(cur != null) {
			
			temp = cur.next;
			
			while(temp != null) {
				
				if(cur.data > temp.data) {
					cur.next = temp.next;
					temp = pre;
					pre.next = cur;
					
				}
				
			}

		}
		
		
		
	}
	

	public int size() {
		Node temp = head;
		size = 0;
		
		if(isEmpty()) {
			return 0;
		}else {
			while(temp !=null) {
				temp = temp.next;
				size++;
			}
			return size;
		}
	}
	
	public void show() {
		Node current = head;
		
		if(isEmpty()) {
			System.out.println("List are empty!");
			return;
		}
		
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println("\n::::::Bye:::::::\n");
	}
	
	public boolean isEmpty() {
		return head==null?true:false;
	}
	
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

}
