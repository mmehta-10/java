package BinaryTree;

/** Class containing left and right child of current 
node and key value*/
class Node  {
	int data;
	Node left, right;

	public Node(int item)  {
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	//Root of the Binary Tree
	Node root;
	private static int count = 0;

	/**
	 *  Function to get the count of leaf nodes in a binary tree
	 * */
	int getLeafCount()  {
		return getLeafCount(root);
	}

	int getLeafCount(Node node)  {

		if(node == null)
			return 0;

		if(node.right==null && node.left==null)		
			return 1;
		else
			return getLeafCount(node.left) + getLeafCount(node.right);
	}
}

/**
 * Taken from: http://www.geeksforgeeks.org/write-a-c-program-to-get-count-of-leaf-nodes-in-a-binary-tree/
 * @author meghamehta
 *
 */
public class CountLeafNodes {

	/* Driver program to test above functions */
	public static void main(String args[])  {
		/* create a tree */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		/* get leaf count of the abve tree */
		System.out.println("The leaf count of binary tree is : "
				+ tree.getLeafCount());
	}
}