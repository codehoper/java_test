package com.ub.interview;

public class Swap {

	public Swap() {
	
	}
	
	public  void swap(int a,int b) {
		System.out.println("Before swapping a and b"+" a :"+a+ "b :"+b);
		int temp = b;
		b = a;
		a = temp;
		System.out.println("After swapping "+":: a: :"+a+ "::b ::"+b);
	}
	 
	
	public  void swapWithoutTemp(int a,int b) {
		System.out.println("Before swapping a :"+a+" ::and b :"+b);
		a = a + b;
		b = a -b ;
		a = a- b;
		System.out.println("After swapping a :"+a+" ::and b :"+b);
	}
	
	public void swapBinary(int a,int b) {
		System.out.println("Before swapping a :"+a+" ::and b :"+b);
		a ^= b; //(a = a xor b)
		b ^= a;
		a ^= b;
		System.out.println("After swapping a :"+a+" ::and b :"+b);
	}
	
}
