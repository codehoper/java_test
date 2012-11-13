package com.ub.rec;

public class Fibo {
	
	
	Fibo() {
		
	}
	
	private int result;
	private int pastMemo = 0;
	
	
	/**
	 * Iterative solution 
	 */
	
	public int getfiboItr(int n) {
		int i = 0;
		int [] fibo = new int[n+1];
		fibo[0] = 0;
		fibo[1] = 1;
		for(i=2;i<=n;i++) {
			fibo[i] = -1;
		}
		
		for (i=2;i<=n;i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		return fibo[n];
	}
	
	/**
	 * Iterative optimal solution
	 */
	
	public int getfiboRecOpt(int n) {
		//0,1,1,2,3,5,8,13,21
		int prev = 0;
		int current = 1;
		int next = 0;
		for(int i=1;i<n;i++) {
			next = prev + current;
			prev = current;
			current = next;
		}
		
		return current;
	}
	
	/***
	 * Recursive solution
	 * @param n
	 * @return
	 */
	public int getfibo(int n) {
		if(n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else 
		{
//			result = getfibo(n-1) + getfibo(n-2);
//			return result;
			return (getfibo(n-1) + getfibo(n-2));
		}
		
	}
	
	
	
	public static void main(String args[]) {
		
		Fibo fib = new Fibo();
//		int n = fib.getfibo(6);
		int n = fib.getfiboItr(8);
		int m = fib.getfiboRecOpt(8);
		System.out.println("Ans :"+n);
		System.out.println("Ans :"+m);
	}
}
