package com.ub.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class email_regex {

	
	private boolean validateMailId(String mailId) {
		
		if(mailId.matches("(\\w+)[@](\\w+)\\.(\\w+)") == true )
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		
		email_regex email = new email_regex();
		File file = new File(args[0]);
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while( (line = br.readLine()) != null ) {
				if (email.validateMailId(line) == true) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
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
