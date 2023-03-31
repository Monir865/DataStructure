package TreeDemoo;

public class Controller {

	public static void main(String[] args) {
		
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Tree tree = new Tree();
		tree.create(nodes);
		tree.preOrder();
		//System.out.println(n.left.left.data);

	}

}
