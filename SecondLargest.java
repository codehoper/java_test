package com.ub.interview;

/**
 * Find second largest element in array
 * @author Vikram
 *
 */
public class SecondLargest {

	/**
	 * Keep track of 
	 * 1.arraysecond_largest and arraylargest
	 *  2.arraysecond_largest < arrayi < arraylargest
	 */
	private int largest ;
	private int secondLargest ;
	private int[] sampleArray;
	
	public SecondLargest(int[] aSampleArray) {
		largest = 0;
		secondLargest = 0;	
		this.sampleArray = aSampleArray;
		findSecondLargestElement();
	}
	
	private void findSecondLargestElement() {
		
		for(int index=0 ;index<sampleArray.length;index++){
			int comparator = sampleArray[index];
			if(comparator > largest) {
				secondLargest = largest;
				largest = comparator;
			}
			else if(comparator < largest && comparator > secondLargest) {
				secondLargest	=	comparator ;
			}
		}
	}

	public int getSecondLargest() {
		return secondLargest;
	}
	
	
}
