package com.ub.interview;

public class Node<E> {

	private E payload;
	public Node<E> next;
	
//	public Node(E aPayload) {
//		payload = aPayload;
//		next = null;
//	}
	
	public Node(E aPayload,Node<E> refNode) {
		payload = aPayload;
		next = refNode;
	}

	public E getPayload() {
		return payload;
	}

	public Node<E> getNext() {
		return next;
	}
	
	
}
