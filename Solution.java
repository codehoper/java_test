package com.ub.test;


/*
Enter your code here. Read input from STDIN. Print output to STDOUT
Your class should be named Solution
*/
import java.io.*;
public class Solution {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int T = Integer.parseInt(br.readLine());
		for(int testcases = T;testcases>0; testcases--){
			int N = Integer.parseInt(br.readLine());
			//System.out.print(N + " ");
			line = br.readLine();
			String[] numbers = line.split(" ");
			int matrix[] = new int[N];
			for (int i = 0; i < N; i++) {
				matrix[i] = Integer.parseInt(numbers[i]);
				//System.out.print(matrix[i]+ " ");
			}
                   int invCnt = 0;
                   int j= 0;
                   for(int i= 2;i< N;i++) {
                       j = i;
                       while(j>=1) {
                           if(matrix[j] < matrix[j-1]) {
                               int temp = matrix[j-1];
                               matrix[j-1] = matrix[j];
                               matrix[j] = temp;
                               invCnt++;
                           }
                           j--;
                       }
                   }
                   
            System.out.println(invCnt + " ");
		}
	}
}
