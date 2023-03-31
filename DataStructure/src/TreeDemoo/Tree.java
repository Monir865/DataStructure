package TreeDemoo;


class node{
	int data;
	node left,right;
	
	node(int data){
		this.data = data;    
		this.left = null;
		this.right = null;
	}
}


//1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1

public class Tree {
	static int index = -1;
	node root;
	
	private node createNewNode(int data) {
		node newNode = new node(data);
		return newNode;
	}
	
	public node create(int nodes[]) {
	    index++;
	    
	    if(nodes[index] == -1) {
	    	return null;
	    }
	    
	    root = createNewNode(nodes[index]);
	    root.left = create(nodes);
	    root.right = create(nodes);
		return root;
	}
	
	public node preOrder() {
		 System.out.println(root.data);
		 root.left = preOrder();
		 root.right = preOrder();
		 return root;                                                                                                                                                                  
	}
	
}
