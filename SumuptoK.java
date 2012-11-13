package com.ub.codeeval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumuptoK {

	private void largestIncSubsequence(int array[]) {
		//modification of Kanade algorithm for positive numbers
		int len = array.length;
		int startIndex = 0;
		int currentIndex = 0;
		int endIndex = 0;
		int maxLength = 0;
		int currentLength = 0;
		for(int i=1;i<len;i++) {
			if(array[i] < array[i-1]) {
				currentLength = 0;
				currentIndex = i;
			}else if (array[i] > array[i-1]) {	
				currentLength += 1;
			}		
			if(currentLength >= maxLength) {
				maxLength = currentLength;
				endIndex = i;
				startIndex = currentIndex;
			}
			
		}
		
		System.out.println("The max length = "+maxLength +" within index ("+startIndex +","+endIndex+")");
		
	}
	
		//Largest continuous subsequence
	private void largestContinuousSubSeq(int k[]) {
		//in O(n)
		int maxSum = 0;
		int currentSum = 0;
		int currentStartIndex = 0;
		int startIndex = 0;
		int endIndex = 0;
		for(int i=0;i<k.length;i++) {
			currentSum += k[i];
			if(currentSum > maxSum) {
				maxSum = currentSum;
				startIndex = currentStartIndex;
				endIndex = i;
			}else if(currentSum <= 0) {
				currentSum = k[i];
				currentStartIndex  = i;
			}
		}
		System.out.println("Longest common sub sequence sum =  "+maxSum 
				+" with interval ("+startIndex+","+endIndex +")");
	}
	
	private void findpair(int k[],int sum) {
		Arrays.sort(k);
		int low = 0;
		int high = k.length -1;
		List<String> pairs= new ArrayList<String>();
	    while(low<high) {
	    	int cmpSum = k[low] + k[high];
	    	if (sum < cmpSum) {
	    		high --;
	    	}else if(sum > cmpSum) {
	    		low ++;
	    	}else {
	    		pairs.add(low + "," + high);
	    		high--;	//terminating condition
	    	}
	    }
		for(int cnt=0;cnt<pairs.size();cnt++) {
			System.out.println(pairs.get(cnt));
		}
	}
	public static void main(String args[]) {
		SumuptoK sumk = new SumuptoK();
		int arr[] = {55,3,7,12,5,4,6,5,87,12,23,45,46};
		sumk.largestIncSubsequence(arr);
		int sum = 10;
		sumk.findpair(arr, sum);
		int arr1[] = {-11,-2,3,-1,2,-9,-4,-5,2,3};
		sumk.largestContinuousSubSeq(arr1);
//		sumk.largestSubsequence(arr);
		
	}
}
