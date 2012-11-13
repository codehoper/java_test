package com.ub.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reverse_words {

//TODO : reverse words in place
	//not use extra space so used stringbuffer container
	String doSubReverse(StringBuffer str) {
		int len = str.length();
		
		for(int i = 0,j= len -1;i<j;i++,j--) {		//don't do j<len use i<j terminating condition same for palindrome
			char temp = str.charAt(j);
			str.setCharAt(j,str.charAt(i));
			str.setCharAt(i, temp);
		}
		return str.toString(); 
	}
	
	private void revString(StringBuffer str) {
		//reverse string
		String t = doSubReverse(str);
		//reverse words within string
		String arr[] = t.split(" ");
		int len = arr.length;
		for(int i = 0;i<len - 1;i++) {
			System.out.print(doSubReverse(new StringBuffer(arr[i])) + " ");	
		}
		System.out.print(doSubReverse(new StringBuffer(arr[len-1])));
		
	}
	
	private void reverseString (String str) {

		String tokens[] = str.split(" ");
		int len  = tokens.length;
		for (int i = len -1;i >=0 ;i--) {
			if(i != 0)
				System.out.print(tokens[i] + " ");
			else 
				System.out.print(tokens[i]);
		}
	}

	public static void main(String args[]) {

		reverse_words rev = new reverse_words();
		File file = new File(args[0]);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
//			String line;
			String line;
			while((line = br.readLine()) != null) {
//				rev.reverseString(line);
				StringBuffer str = new StringBuffer(line);
				rev.revString(str);
				System.out.print("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
