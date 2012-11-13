package com.ub.test;

public class backtrack1 {

	private boolean isSolution(int k,int n) {
//		if(k == n)
//			return true; 
//		else
//			return false;
		return k==n;
	}
	/**
	 * 
	 * @param a : store the vector //candidates
	 * @param k : store the traversal
	 * @param input : store the input
	 */
	private void backtrack(int a[],int k,int[] input) {
		int c[] = new int[20];
		if(isSolution(k,input.length-1)) {
			processSolution(a,k,input);	//pruning / termination state
		} else {
			k++;
			int noOfCandidate = generateCandidate(c);
			for(int i=0;i<noOfCandidate;i++) {
				a[k] = c[i];
				backtrack(a, k,input);
			}
//			backtrack(a, k, n);
		}
	}
	
	private int generateCandidate(int c[]) {
		c[0] = 1;
		c[1] = 0;
		return 2;
	}
	
	private void processSolution(int a[],int k,int []ip) {
		System.out.print("{");
		for (int i=0;i<=k;i++) {
			if(a[i] == 1) {
				System.out.print(ip[i] + ",");
			}
		}
		System.out.print("}" + "\n");
	}
	
	public static void main(String args[]) {
		int[] ip = {1,4,5};
		int [] a = new int[10];
		backtrack1 bt = new backtrack1();
		int k = -1;
		bt.backtrack(a,k,ip);
	}
	
}
