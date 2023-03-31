package dataStructure;


class node{
	int data;
	node pre;
	node next;
	
	public node(int data) {
		super();
		pre = null;
		this.data = data;
		next = null;
	}
	
}

public class DoubliLinklist {
	private int size = 0;
    public node head = null;
    node tell = null;
    
    DoubliLinklist list1 = null;
	DoubliLinklist list2 = null;;
    
    
    public DoubliLinklist() {
    	super();
    }
    
    public DoubliLinklist  marge(node n1,node n2) {
    	System.out.println("node : "+n1.data);
    	System.out.println("node : "+n2.data);
    	
    	node head1 = n1;
    	
    	DoubliLinklist list = new DoubliLinklist();
    	list.head = head1;
    	list.head.next.data = 500;
    
         return list;
    }
    
    public node createNode(int data){  	
    	node newNode = new node(data);
		return newNode;
    }
    
    public boolean isEmpty(){
    	return (head==null)?true:false;
    };
    
    public int length() {
    	return size;
    }
    
    public void add(int data) {
    	node newNode = createNode(data);
    	if(head==null) {
    		head = tell = newNode;
    		head.next = null;
    		tell.pre = null;
    		size++;
    		return;
    	}
    	
    	tell.next = newNode;
    	newNode.pre = tell;
    	tell = newNode;
    	tell.next = null;
    	size++;
    }
    
    public void insert(int data) {
    	node newNode = createNode(data);
    	
    	if(isEmpty()) {
    		head = tell = newNode;
    		head.next = null;
    		tell.pre = null;
    		size++;
    	    return;
    	}
    	
    	node temp = head;
    	while(temp.next != null) {
    		temp = temp.next;
    	}
    	temp.next = newNode;
    	newNode.pre = temp;
    	temp = newNode;
    	tell = temp;
    	size++;
    }

    public void addByIndex(int data, int index) {
    	
    	if(index > size) {
    		System.out.println("Handle with threads");
    		return;
    	}
    	
    	if(index == size) {
    		add(data);
    		return;
    	}
    	
    	if(index == 0) {
    		addFirst(data);
    		return;
    	}
    	
    	node newNode = createNode(data);
    	
    	node current = head;
    	node preNode = null;
    	
    	while(index > 0){
    		preNode = current;
    		current = current.next;
        	index--;
    	}
    	
    	preNode.next = newNode;
    	newNode.next = current;
    	newNode.pre = preNode;
    	newNode.next.pre = newNode;
    	size++;	
    }
    
    public void addFirst(int data) {
    	node newNode = createNode(data);
    	newNode.next = head;
    	head.pre = newNode;
    	head = newNode;
    	size++;
    }
    
    public void removeLast() {	
    	if(isEmpty()) {
    		System.out.println("Empty handle by exception");
    		return;
    	}
    	tell = tell.pre;
    }
    
    public void removeFirst() {
    	if(isEmpty()) {
    		System.out.println("Empty handle by exception");
    		return;
    	}
    	
    	head = head.next;
    	head.pre = null;
    }

    public void removeByIndex(int index) {
    	if(isEmpty()) {
    		System.out.println("Empty handle by exception");
    		return;
    	}

    	if(index > size-1) {
    		System.out.println("out of list size handle by exception");
    		return;
    	}
    	
    	if(index == 0) {
    		removeFirst();
    		return;
    	}
    	 
    	if(index == size-1) {
    		removeLast();
    		return;
    	}
    	
    	node temp = head;
    	node current = head;
    	
    	if(current.next.next != null) {
    		current = current.next.next;
    		while(index > 1) {
    			temp = temp.next;
    			current = current.next;
    			index--;
    		}
    		temp.next = current;
    		current.pre = temp;
    		size--;
    	}			
    }
    
    public void margeList(DoubliLinklist list) {
    	if(size<=0 || list.size<=0) {
    		System.out.println("list are empty handle by exception.");
    		return;
    	}
    	
    	tell.next = list.head;
    	list.head.pre = tell;
    	tell = list.tell;
    	list.head = head;
    }
    
    
    
    public void show() {
    	node temp = head;
    	if(isEmpty()) {
    		System.out.println("Empty List");
    		return;
    	}
    	while(temp != null) {
    		System.out.print(temp.data+", ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
    
    public void reverseShow() {
    	node current = tell;
    	if(isEmpty()) {
    		System.out.println("Empty List");
    		return;
    	}
    	while(current != null) {
    		System.out.print(current.data+", ");
    		current = current.pre;
    	}
    	System.out.println();
    }
}
