package com.ub.dynamic;

public class SplitPalindrome {

	private boolean isPalindrome(String src) {	
		char [] srcChar = src.toCharArray();
		int len = src.length();
		for(int i=0,j=len-1;i<len/2;i++,j--) {
			if(srcChar[i] != srcChar[j])
				return false;
		}
		return true;
		
	}
	
	private int palindromeSplit(String src) {
//		int count = 1;
		if(isPalindrome(src) == true) {
			return 1;
		}else {
			int len = src.length();
			int count = len;
			for(int i=1;i<len;i++) {
			  count	= Math.min(palindromeSplit(src.substring(0, i)) 
					  + palindromeSplit(src.substring(i,len-1)),count);
			}
			return count;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitPalindrome splt = new SplitPalindrome();
		boolean ans;
		ans = splt.isPalindrome("TAT");
		ans = splt.isPalindrome("NAMAN");
		ans = splt.isPalindrome("KARAN");
		int cnt = splt.palindromeSplit("abacdcefe");
		System.out.println("Ans is ="+cnt);
	}

}
