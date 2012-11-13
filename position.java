package com.ub.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class position {
	
	
	private boolean isSameBitPosition(int number,int pos1,int pos2) {
		
		pos1 = pos1 - 1;
		pos2 = pos2 - 1;
		int p1 = 1 << pos1;
		int p2 = 1 << pos2;
		p1 = (((number & p1) >> pos1) ^ ((number & p2) >> pos2));
		if (p1 == 0)
			return true;
		else 
			return false;
	}
	
	
	public static void main(String args[]) {
		
		
		position bit = new position();
		
		try {
	        File file = new File(args[0]);
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        try {
				while ((line = in.readLine()) != null) {
					String[] strs = line.split(",");
					int number = Integer.parseInt(strs[0]);
					int pos1 = Integer.parseInt(strs[1]);
					int pos2 = Integer.parseInt(strs[2]);
					boolean isAns = bit.isSameBitPosition(number,pos1,pos2);
//				isAns = bit.isSameBitPosition(125,1,2);
					if(isAns == true) {
						System.out.println("true");
					}else {
						System.out.println("false");
					}	
				
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
