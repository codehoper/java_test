package com.ub.linkedin;

public class Singleton {

	private static Singleton Instance = null;
	
	private Singleton() {
//		if(Instance == null) {
//			Instance = new Singleton();
//		}
	}
	
	public static Singleton getInstance() {
		if(Instance == null) {
			Instance = new Singleton();
		}
		return Instance;
	}
	
	private int getValue(int n) {
		return n;
	}
	
	public static void main(String args[]) {
		
		Singleton s;
		s = Singleton.getInstance();
		System.out.println(s.Instance.getValue(12) );
	}
	
}
