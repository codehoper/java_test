package com.ub.interview;

public class BSTDummy {

	private Node root;

	public enum TravesalType {
		PRE_ORDER,
		IN_ORDER,
		POST_ORDER
	}

	private  class Node {
		Node left;
		Node right;
		int payload;

		public Node(int aPayLoad) {
			left = null;
			right = null;
			payload = aPayLoad;
		}
	}


	public BSTDummy() {
		root = null;
	}

	private void traverseInOrder(Node node) {
		if(node == null) {
			return;
		}
		traverseInOrder(node.left);
		System.out.print(node.payload +"  ");
		traverseInOrder(node.right);
	}

	private void traversePreOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.payload + "  ");
		traversePreOrder(node.left);
		traversePreOrder(node.right);
	}
	private void traversePostOrder(Node node) {
		if(node == null) {
			return;
		}
		traversePostOrder(node.left);
		traversePostOrder(node.right);
		System.out.print( node.payload +"  ");
	}

	private Node insertNode(Node node, int aPayLoad) {
		if(node == null) {
			node = new Node(aPayLoad);
		}
		else if(node.payload <= aPayLoad) {
			node.right	 = insertNode(node.right, aPayLoad);
		}
		else if(node.payload >= aPayLoad) {
			node.left = insertNode(node.left, aPayLoad);
		}
		return node;
	}

	public void insertTreeNode(int aPayLoad) {
		root = insertNode(root,aPayLoad);
	}

	public void traverseBST(TravesalType type) {
		if(type == TravesalType.IN_ORDER) {
			traverseInOrder(root);
		}
		else if(type == TravesalType.PRE_ORDER) {
			traversePreOrder(root);
		}
		else if(type == TravesalType.POST_ORDER) {
			traversePostOrder(root);
		}
	}


	private void deleteTreeNode(int key) {
		//perform lookup and then delete
		//lookUp(key,root);
		//root = delNode(root, key);
		root = delNode(root, key);
	}

	private Node delNode(Node node,int key) {
		if(node == null) {
			return null;
		}
		if(node.payload < key) {
			node.right	= delNode(node.right, key);
		}
		else if(node.payload > key) {
			node.left = delNode(node.left,key);
		}
		else if(node.left != null && node.right != null) {
			//find the minimum node(right min) / maximum node(left max)
			node.payload = findMin(node.right).payload;
			node.right = delNode(node.right, node.payload);
		}
		else {
			if(node.left != null) {
				node = node.left;
			} 
			else {
				node = node.right;
			} 
		}
		return node;
	}

	private Node findMin(Node node) {
		if(node == null) {
			return null;
		}
		else if(node.left == null) {
			return node;
		}
		return findMin(node.left);
	}

	///find maximum node in binary tree
	private Node  findMaxNode(Node node) {
		if(node != null) {
			//find maximum node
			while(node.right != null) {
				node = node.right;
			}
			return node;
		}
		return null;		
	}

	private void lookUp(int key, Node node) {
		if(node != null) {
			if(node.payload == key) {
				System.out.println("Found key");
				if(node.left == null && node.right == null) {
					//node with no children/leaf node
					node = null;
				}
				else if(node.left != null && node.right == null ) {
					Node prevNode = node.left;
					node =  null;
					node = prevNode;
				}
				else if(node.left == null && node.right != null) {
					Node prevNode = node.right;
					node =  null;
					node = prevNode;
				}
				else if(node.left != null && node.right !=null) {

				}

			}
			else if(node.payload < key) {
				node = node.right;
				lookUp(key, node);
			}
			else if(node.payload > key) {
				node = node.left;
				lookUp(key, node);
			}		
		}	
		else if(node == null){
			System.out.println("key not found");
		}
	}

	public boolean deleteNode(int key) {
		deleteTreeNode(key);
		return true;

	}

}