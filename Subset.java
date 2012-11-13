package com.ub.test;

import java.util.ArrayList;
import java.util.List;

public class Subset {


	private List<Integer> constructSubset(int x[],int sum) {
		List <Integer> y = new ArrayList<Integer>();
		int n = x.length;
		//base case
		if (sum == 0) {
			return y;
		}else if(sum < 0 || n==0) {
			return null;
		}else {
			int temp[] = new int[n-1];
			for(int i=1,j=0;i<n;i++,j++) {
				temp[j] = x[i]; 
			}
			y = constructSubset(temp, sum); //exclude 1st element
			printlist(y);
			if(y != null) {
//				List<Integer> lst = new ArrayList<Integer>();
//				for(int i=0;i<temp.length;i++) {
//					lst.add(temp[i]);
//				}
//				y.addAll(lst);
				System.out.println("the size of the list"+y.size());
				return y;
			}
			y = constructSubset(temp, sum-x[0]); //includes 1st element
			if(y!= null) {
				y.add(x[0]);
				printlist(y);
				
				return y;
			}
       
		}
	
	 return null;
	}

	private void printlist(List<Integer> y) {
		try{
		for(int t:y) {
			System.out.println(t);
		}
		}catch (Exception e) {
			System.out.println(" 0 elements");
		}
		
	}

	public static void main(String args[]) {

		Subset subset = new Subset();
		int x[] = {8,6,7,5,3,10,9};
		int sum = 15;
		List<Integer> list = subset.constructSubset(x,sum);
		
	}

}
