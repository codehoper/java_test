package com.ub.thread;

import java.awt.Point;

/**
 * In java always use call-by-value with Reference type so value changes 
 * 
 * @author vikram
 *
 */
public class CallByValueChange { 
	public static void change(Point a) { 
		a = new Point(5,5); 
	} 
	public static void main(String[] args) { 
		Point p = new Point(1,1); 
		change(p); 
		System.out.println("x=" + p.x + ";y=" + p.y); 
	} 
} 