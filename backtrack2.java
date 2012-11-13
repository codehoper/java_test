package com.ub.test;

import javax.swing.text.StyledEditorKit.BoldAction;

public class backtrack2 {
	
	private boolean isSolution(int k,int n) {
		return k==n;
	}
	
	private void printSolution(int a[],int ip[],int k) {
		System.out.print("{");
		for (int i=0;i<=k;i++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.print("}" + "\n");
	}

	
	private void backtrack(int a[],int ip[],int k) {
		int c[] = new int[ip.length + 1];
		int noCandidate;
		if(isSolution(k,ip.length-1)) {
			printSolution(a,ip,k);
		}else {
			k++;	//get the value of vector "a" at each iteration
			noCandidate = generateCandidate(c,k,ip,a);
			for(int i=0;i<=noCandidate;i++) {
				a[k] = c[i];				//not a[i] = a[i] it interpreats differently
				backtrack(a,ip, k);	
			}
			
		}
		
	}
	
	private int generateCandidate(int[] c, int k,int ip[],int[] a) {
		int len = ip.length - 1;
//		System.out.print("{");
//		for (int i=0;i<=len;i++) {
//			System.out.print( " " +a[i] + " ");
//		}
//		System.out.print("}" + "\n");
		
		boolean vector[] = new boolean[10];
		//use the vector DS
		for (int i=0;i<=len;i++) {
			vector[i] = false;
		}
		for(int i=1;i<k;i++) {
			vector[a[i]] = true;
		}
		
		for (int i=k,j=0;j<= len ;i++,j++) {
			if(a[k] != 0){
				c[j] = ip[(k-1)%(len+1)];
			}else {
				c[j] = ip[i%(len+1)];
			}
		}
		return (len - k) ;

	}

	
	public static void main(String args[]) {
		int ip[] = {2,4,5};
		int a[] = new int [ip.length];
		int k = -1;
		backtrack2 bt2 = new backtrack2();
		bt2.backtrack(a, ip, k);
	}
}
