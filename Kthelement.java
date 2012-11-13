package com.ub.test;

public class Kthelement {

	
	private void findKthElement(int input[],int k,int low,int pivotIP) {
		int n = input.length;
		if(n < k) {
			//element not found
		}else {
//			int pivot = input[pivotIP];
//			int low = 0;
			int high = pivotIP - 1;
			while(low < high) {
				if(input[pivotIP] > input[low]) {
					low++;
				}else if(input[pivotIP] < input[high]) {
					high--;
				}else {
					swap(low,high,input);
				}
			}
			swap(low,high,input);
			swap(high,pivotIP,input);
			if(high == k) {
				//element found
				System.out.println(" kth "+ input[high]);
			}else if(high > k) {
				findKthElement(input, k,0,high -1);
			}else {
				findKthElement(input, k,high+1,n-1);
			}
			
		}
	}
	
	private void swap(int low, int high, int[] input) {
		int temp = input[low];
		input[low] = input[high];
		input[high] = temp;
	}

	public static void main(String args[]) {
		//find 4th max element in array
		int input[] = {33,2,12,45,66,18,8};
		Kthelement kth = new Kthelement();
		kth.findKthElement(input, 4,0, input.length -1);
	}
}
