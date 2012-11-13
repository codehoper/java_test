package com.ub.rec;

public class Reverse {

	
	private String reverse(String s) {
		
	    if (s.length() <= 1) { 
	        return s;
	    }
	    System.out.println(""+s);
	    return reverse(s.substring(1, s.length())) 
	    		+ s.charAt(0);//put the string one by one on stack and just return 1 character
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse rev = new Reverse();
		String str = rev.reverse("12345");
		System.out.println("Reverse String ::"+str);

	}

}
