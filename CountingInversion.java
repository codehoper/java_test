package com.ub.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountingInversion {

		private int[] arr = new int[100000];
		private int invCount;
		public CountingInversion() {
			readandPopulateArray();
			computeInversion();
		}
		
		private void computeInversion() {
			int len = arr.length;
			int i,j;
			for(i=0;i<len;i++) {
				for(j=i+1;j<len;j++) {
					if(arr[i] > arr[j]) {
						invCount ++;
					}
				}
			}
		}
		
		private void readandPopulateArray() {			
			try {
				BufferedReader in
				= new BufferedReader(new FileReader("IntegerArray.txt"));
				String strLine;
				//Read File Line By Line
				try {
					int i = 0;
					while ((strLine = in.readLine()) != null)   {
						// Print the content on the console
						arr[i] = Integer.parseInt(strLine);
						i++;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Close the input stream
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		public int getInverionCount() {
			return invCount;
		}
		
	
}
