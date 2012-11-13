package com.ub.dynamic;

import javax.swing.text.html.MinimalHTMLWriter;

public class PalindromeSplit {
	//	m[i,j] = 0 if i==j
	//	 	   = min i<k<j { isNumeric_palim[i,k]+m[k+1,j]+di-1.dk.dj} if i<j
	//		   = undefined
	
	private boolean isPalindrome(String src) {
		int low = 0;
		int high = src.length() - 1;
		while(low < high) {
			if(src.charAt(low) != src.charAt(high)) {
				return false;
			}
			low ++;
			high --;
		}
		return true;
	}

	private int isNumPalindrome(String src) {
		int low = 0;
		int high = src.length() - 1;
		while(low < high) {
			if(src.charAt(low) != src.charAt(high)) {
				return 1;
			}
			low ++;
			high --;
		}
		return src.length() -1;
	}
	
	private void minSplit(String str) {
		int len = str.length();
		int p[][] = new int [len+1][len+1];
		int path[][] = new int [len+1][len+1];
		int passes = len - 1;
		for (int t=0;t<=passes;t++) {
			for (int i=1,j=i+t;i<=len-t;i++,j++) {
				int min = Integer.MAX_VALUE;
				for(int k=i;k<j;k++) {
					//as I want to use  "str.substring(i,k)) + str.substring(k+1,j)" but to achieve this in java
					//you have to subtract 1 from i and add 1 in last just see the substring function
					//"abcd" => substring(1,3) returns c
					int current_min = 
							p[i][k] + isNumPalindrome(str.substring(i-1,k+1)) + isNumPalindrome(str.substring(k,j));
					if(current_min < min) {
						min = current_min;
						p[i][j] = min;
					}
				}
			}
		}
		//Print the matrices
		for (int i=1;i<=len;i++) {
			for (int j=1;j<=len;j++) {
				System.out.print(p[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		
	}

	public static void main(String args[]) {
		PalindromeSplit palin = new PalindromeSplit();
		System.out.println("AAA is =="+palin.isPalindrome("AAA"));
		System.out.println("adc==="+palin.isPalindrome("adc"));
//		palin.minSplit("abcde");
		System.out.println();
//		palin.minSplit("abacdcefe");
		palin.minSplit("abcd");
//		palin.minSplit("abacdc");
	}
}
