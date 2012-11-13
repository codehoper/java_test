package com.ub.interview;

public class BST<E> {

	private TreeNode<E> root;


	//Initially root == null
	public BST() {
		root = null; 
	}

	public void insertNode(TreeNode<E> aNode,E aPayload) {
		if(aNode == null) {
			aNode  = new TreeNode<E>(aPayload);
			root = aNode;
		}
		else if(aNode.compareTo(aPayload) < 0)  {
			root = aNode.getLeft();
			insertNode(aNode.getLeft(), aPayload);
		}
		else if( aNode.compareTo(aPayload) > 0) {
			root = aNode.getRight();
			insertNode(aNode.getRight(), aPayload);
		}
	
	}

	public TreeNode<E> getRoot() {
		return root;
	}


}
