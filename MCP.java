package com.ub.dynamic;

import org.omg.CORBA.INTERNAL;

public class MCP {

	//	m[i,j] = 0 if i==j
	//	 	   = min i<k<j {m[i,k]+m[k+1,j]+di-1.dk.dj} if i<j
	//		   = undefined


	private int dummyCalculation(int input[]) {
		int noOfMatrices = 6;
		int UNDEFINED = 0;
		int m[][] = new int [7][7];
		int passes = noOfMatrices-1; //no of parenthesis

		
		//Initialization not necessary
//		for (int i=1;i<=noOfMatrices;i++) {
//			for (int j=1;j<=noOfMatrices;j++) {
//				if(i == j){
//					m[i][j] = 0;
//				}else if(i > j) {
//					m[i][j] = UNDEFINED;
//				}
//			}
//		}

		int path[][] = new int[7][7];
//		 We can't fill the matrix like normal matrix horizontally it should be fill diagonally
		for (int p=0;p<=passes;p++) {
			for (int i=1,j=1+p;i<=noOfMatrices-p;i++,j++) {
				int min = Integer.MAX_VALUE;
				for(int k=i;k<j;k++) {
					int current_min = (m[i][k]+m[k+1][j])+(input[i-1]*input[k]*input[j]);
					if(min > current_min) {
						min = current_min;
						m[i][j] = min;
						path[i][j] = k;
					}
				}
			}
		}

//		//Print the matrices
//		for (int i=1;i<noOfMatrices+1;i++) {
//			for (int j=1;j< noOfMatrices+1;j++) {
//				System.out.print(m[i][j] + "\t");
//			}
//			System.out.print("\n");
//		}
//		System.out.println();
//		//Print the paths
//		for (int i=1;i<noOfMatrices+1;i++) {
//			for (int j=1;j< noOfMatrices+1;j++) {
//				System.out.print(path[i][j] + "\t");
//			}
//			System.out.print("\n");
//		}
		
		return m[1][noOfMatrices];
	}
	private int calculateNoofMultiplication(int input[]) {

		int noOfMatrices = 6;
		int UNDEFINED = 0;
		int m[][] = new int [7][7];
		/**
		 * We can't fill the matrix like normal matrix horizontally it should be fill diagonally
		 */
		//		for (int i=1;i<=noOfMatrices;i++) { 
		//			for (int j=1;j<=noOfMatrices;j++) {
		//				if(i == j){
		//					m[i][j] = 0;
		//				}else if(i > j) {
		//					m[i][j] = UNDEFINED;
		//				}else if(i < j) {
		//					int min = Integer.MAX_VALUE;
		//					for(int k=i;k<j;k++) {
		//						int current_min = (m[i][k]+m[k+1][j])+(input[i-1]*input[k]*input[j]);
		//						if (min > current_min) {
		//							m[i][j] = current_min;
		//							min = current_min;
		//						}
		//					}
		//				}
		//				System.out.print(m[i][j] + "\t");
		//			}
		//			System.out.println();
		//		}

		for (int i=1;i<=noOfMatrices;i++) {
			for (int j=1;j<=noOfMatrices;j++) {
				if(i == j){
					m[i][j] = 0;
				}else if(i > j) {
					m[i][j] = UNDEFINED;
				}
			}
		}
		int passes = noOfMatrices -1; //no of parenthesis

		for (int i=1;i<=passes;i++) {
			for (int j=1;j<noOfMatrices;j++) {
				int min = Integer.MAX_VALUE;
				for(int k=i;k<=j;k++) {
					int current_min = (m[i][k]+m[k+1][j])+(input[i-1]*input[k]*input[j]);
					if (min > current_min) {
						m[j][j+1] = current_min;
						min = current_min;
					}
				}
			}
		}

		for (int i=1;i<noOfMatrices+1;i++) {
			for (int j=1;j< noOfMatrices+1;j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.print("\n");
		}
		return m[1][noOfMatrices];
	}

	public static void main(String args[]) {
		//matrix is represented by the array
		int input[] = {10,20,1,40,5,30,15}; // there are 6 matrices it is just a representation
		MCP mcp = new MCP();
//		int cost = mcp.calculateNoofMultiplicatio(input);
		int cost = mcp.dummyCalculation(input);
		System.out.println("total no of calulcation = "+cost);

	}

}
