package com.ub.test;

public class Regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "string";
		if (str.matches("(string)")) {
			System.out.println(" equal ");
		}else if(str.matches("[string]")) { //Equivalent to write s|t|r|i|n|g
			System.out.println(" match");
		}
	}

}
