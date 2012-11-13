package com.ub.interview;

public class TreeNode<E> implements Comparable<E> {
	
	private E payLoad;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode(E aPayLoad) {
		payLoad = aPayLoad;
		left = null;
		right = null;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public E getPayLoad() {
		return payLoad;
	}

	@Override
	public String toString() {
		return (String)this.getPayLoad();
	}
	
	@Override
	public int compareTo(E o) {
		//If it is type of String
		if(o instanceof String) {
			return this.toString().compareTo((String) o);
		}
		//If it is type of Integer
		else if(o instanceof Integer) {
			if((Integer) o <  (Integer)this.getPayLoad()) {
				return 0;
			}
			else  { // if greater or equal
				return 1; 
				} 
		}
		else {
			return 0;
		}
	}
}
