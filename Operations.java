package com.ub.viks;

import java.util.Timer;

public class Operations {
	//perform addition,multiplication and division without operators
	
	
	private int result;
	private long time;
	private void additionWithoutOperation(int a,int b) {

	}

	private int recMultTable(int noOfAddition,int no) {
		if(noOfAddition == 1) {
			result = no;
		}else {
			result = no + recMultTable(noOfAddition -1, no);
		}
		return result;
	}
	private int recMultiplication(int noOfAddition,int no) {
		if (noOfAddition > 0) {
//			if((noOfAddition % 2) == 1) {
//				result += no;
//			}
			result = result + no + recMultiplication((noOfAddition/2), no);
			return result;
		}
		return result + result;
	}
	
	
	private void performMultiplication(int noOfAddition,int no) {
		//naive approach
		int i = 0;
		
		for(i=0;i<noOfAddition;i++){
			result += no;
		}
	}

	private void multWithoutSign(int first,int second) {
		//add the numbers to simulate multiplication
		int diff = first - second;
		long time1 = System.currentTimeMillis();
		if(diff <= 0) {
			//use second operand to determine number of addition
//			performMultiplication(first,second);
//			recMultiplication(first, second);
			recMultTable(first, second);
		}else {
			//use first operand to determine number of addition
//			performMultiplication(second,first);
//			recMultiplication(second, first);
			recMultTable(second, first);
		}
		long time2 = System.currentTimeMillis();
		time = time2-time1;

	}

	private void divWithoutSign() {
		//
	}


	public static void main(String args[]) {
		long time = System.currentTimeMillis();
		Operations oper = new Operations();
//		oper.multWithoutSign(100000,100000);
		oper.multWithoutSign(10, 1000000);
		System.out.println("Result :"+oper.result + "\n time :"+oper.time);
	}
}
