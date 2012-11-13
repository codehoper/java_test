package com.ub.viks;

class Anagram {
	private String input1;
	private String input2;

	Anagram () {
	}


	private boolean isAnagram (String i1,String i2) {
		this.input1 = i1.toLowerCase();
		this.input2 = i2.toLowerCase();
		//create hash and it should ne same
		int len1 = input1.length();
		int len2 = input2.length();
		boolean isAnagram = false;
		if(len1 == len2) {
			int hash1 = 0,hash2 = 0;
			for(int i=0;i<this.input1.length();i++) {
				hash1 += (int)this.input1.charAt(i); 
				hash2 += (int)this.input2.charAt(i); 	
			}
			if(hash1 == hash2 && hash1 != 0) {
				isAnagram = true;
			}
		} 
		return isAnagram;
	}


	public static void main(String args[]) {
		Anagram ang = new Anagram();
		boolean isAnagram = ang.isAnagram("gorithm","logarithm");
		if(isAnagram == true) {
			System.out.println("This is anagram");
		} else {
			System.out.println("This is not anagram");
		}
	}
}