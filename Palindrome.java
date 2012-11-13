package com.ub.viks;

public class Palindrome {
	
	private String input;
	
	Palindrome(String ainput) {
		this.input = ainput;
	}
	
	boolean verfiyString() {
		int len = input.length();
		for(int i=0,j=len-1;i<len/2;i++,j--) {
			if(input.charAt(i) != input.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String args[]) {
		boolean isPalindrome;
		Palindrome palin = new Palindrome("NANF");
		isPalindrome = palin.verfiyString();
		if(isPalindrome) {
			System.out.println("This is the palindrome string");
		}else {
			System.out.println("This is not palindrome string");
		}
	}
}
