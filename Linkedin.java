package com.ub.dynamic;

import java.util.Arrays;

public class Linked {
	
	
	private boolean verifyPalindorm(String s) {
	    int low = 0;
	    int high = s.length()-1;  
	    while(low < high) {
	        if(s.charAt(low) != s.charAt(high)) {
	            return false;
	        }
	        low ++;
	    }
	    return true;
	}


	private boolean verfiyAnagram(String s,String t) {
	       
	       int slen = s.length();
	       int tlen = t.length();
	       if(slen == tlen) {
	           char[] s_arr = s.toCharArray();
	           char[] t_arr = t.toCharArray();
	           Arrays.sort(s_arr);
	           Arrays.sort(t_arr);
	           for(int i=0;i<slen;i++) {
	               if(s_arr[i] != t_arr[i]) {
	                   break;
	               }
	           }
	          return true;
	       }
	       return false;
	}
	
	public static void main() {
		
	}
	
}
