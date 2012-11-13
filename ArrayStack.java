package com.ub.interview;

public class ArrayStack<E> {
	
	private static final int   INTIAL_CAPACITY = 10;
	private E[] stack;
	private int currentSize = 0;
	private int currentCapacity = 0;
	
	public ArrayStack() {
		currentCapacity = INTIAL_CAPACITY;
		stack = (E[]) new Object[currentCapacity];
	}
	
	public void push(E element){
		verifyCapacity();
		stack[currentSize++] = element;
	}
	
	public E pop() {
		return stack[--currentSize];
	}
	
	private void verifyCapacity() {
		if( currentSize == currentCapacity) {
			//Reallocate data to stack as stack is reference variable 
			currentCapacity = 2*currentCapacity;
			E[] newStack = (E[]) new Object[currentCapacity];
			System.arraycopy(stack, 0, newStack, 0, currentSize);
			stack = newStack; //Update the reference for stack to newStack
		}
	}
	

}
