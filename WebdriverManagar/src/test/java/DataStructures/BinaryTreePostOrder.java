package DataStructures;

import DataStructures.BinaryTreeInorder.TreeNode;

public class BinaryTreePostOrder {
	
	// Post Order
	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data) {
			this.data= data;
		}
	}
	
public static TreeNode attachNodes(){
		
		TreeNode rootnode= new TreeNode(40);
		TreeNode node20= new TreeNode(20);
		TreeNode node10= new TreeNode(10);
		TreeNode node30= new TreeNode(30);
		TreeNode node60= new TreeNode(60);
		TreeNode node50= new TreeNode(50);
		TreeNode node70= new TreeNode(70);
		
		rootnode.left=node20;
		rootnode.right=node60;
		
		node20.left=node10;
		node20.right=node30;
		
		node60.left=node50;
		node60.right=node70;
		
		return rootnode;
	}

public void PostOrder(TreeNode root){
	
	if(root!=null){
		PostOrder(root.left);
		PostOrder(root.right);
		System.err.print(root.data + " ");	
	}
}

public static void main(String[] args) {
	
	BinaryTreePostOrder BT= new BinaryTreePostOrder();
	TreeNode attachNodes = attachNodes();
	BT.PostOrder(attachNodes);
	
}

}
