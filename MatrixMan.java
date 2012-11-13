package com.ub.dynamic;

public class MatrixMan {

	
	private void print_circular(int mat[][],int start,int end) {
		
		if(start == mat.length) {
		}
		
	}
	
	private void print_circular(int mat[][]) {
		System.out.println("the length = "+mat.length);
		for(int i=0;i<mat.length;i++) {
			
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2,3},
					   {8,9,4},
					   {7,6,5}};
		
		MatrixMan matrixMan = new MatrixMan();
//		matrixMan.print_circular(mat);
		matrixMan.print_circular(mat,0,0);
	}
	

}
