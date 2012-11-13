package com.ub.interview;

public class SLL<E> {

	private Node<E> head = null;
	
	public void  addPayload(E aPayload) {
		head = new Node<E>(aPayload, head);
	}
	
	@Override
	public String toString() {
		Node<E> tempHead = head;
		String result = "";
		while(tempHead != null) {
			result += tempHead.getPayload();
			if(tempHead.getNext()!= null) {
				tempHead = tempHead.getNext();
				result += " ==> ";
			}
			else {
				break;
			}
		}
		return result;
	}
}
