package com.ub.thread;

import java.awt.Point;

public class StringJava {

	public static void main(String [] args) {
		String s1 = new String ("Hello");
		String s2 = new String ("hello");
		//		String s2 = s1;
		if(s1.equals(s2)) {
			System.out.println(" equals ");
		}else {
			System.out.println("not equals");
		}

		//Copy-constructor in java
		//Foo x = new Foo(1); 
		//Foo y = new Foo(x);  Not  the  same  as 
		//x = y; 
		Point q1 = new Point(5,5); 
		Point q2 = new Point(q1); 
		q2.x = 15; 
		System.out.println("x ::"+q2.x + "\n" +"Y ::"+q2.y);
		System.out.println("x ::"+q1.x + "\n" +"Y ::"+q1.y);
	}
}
