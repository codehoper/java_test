package com.ub.interview;


public class SLL<E> {

	public Node<E> head = null;
	
	public void  addPayload(E aPayload) {
		head = new Node<E>(aPayload, head);
	}
	
	@Override
	public String toString() {
		Node<E> tempHead = head;
		String result = "";
		while(tempHead != null) {
			result += tempHead.getPayload();
			if(tempHead.next!= null) {
				tempHead = tempHead.next;
				result += " ==> ";
			}
			else {
				break;
			}
		}
		return result;
	}
	
	
	public Node<E> reverseList(Node<E> currentNode,Node<E> toBeNextNode) {
		
		Node<E> curHead = currentNode;
		if((curHead == null || curHead.getNext() == null) && toBeNextNode == null) {
			return curHead; //ignore size 0 & 1
		}
		 if (curHead.getNext() != null) {
			 curHead = reverseList(currentNode.getNext(), currentNode); // travarse till end recursively
		 }
		 currentNode.next = toBeNextNode; // reverse link
		 toBeNextNode.next = null;
		 return curHead;
	}
		
	
}
