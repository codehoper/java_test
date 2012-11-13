package com.ub.test;
import java.util.Arrays;
import java.util.Collections;


public class Knapsack {


	private void subsetSum(int n,int W) {
		Integer M[][] = new Integer[n+1][W+1];
		int wt[] = {2,2,3};

		for(int i=0;i<=W;i++) {
			M[0][i] = 0;
		}
		for (int i=1;i<=W;i++) {
			for(int w=0;w<=W;w++) {
				if(W<w) {
					M[i][W] = M[i-1][W];
				}else {
					int max = w + M[i-1][W-w];
					int max1 = M[i-1][w];
					if(max < max1){
						M[i][w] = max1; 
					}else {
						M[i][w] = max;
					}
				}
			}
		}

	}

	private void printChange(Integer s[],int d[],int n) {
		while(n > 0) {
			System.out.print(s[n] + "\t");
			n = n - d[s[n]];
		}
	}
	private void makeChange(Integer d[],int amt) {
		//k no of denomination
		//n amt
		int k = d.length - 1;
		int c[] = new int[amt+1];
		int s[] = new int[amt+1];
		c[0] = 0;
		for(int p=1;p<=amt;p++) {
			int min = Integer.MAX_VALUE;
			int coin = 0;
			for(int i=1;i<k;i++) {
				if(d[i] <= p) {
					if(1+c[p-d[i]] < min) {
						min = 1 + c[p-d[i]];
						coin = i;
					}
				}
				c[p] = min;
				s[p] = coin;
			}
		}

		int n = amt;
		while(n > 0) {
			System.out.print(s[n] + "\t");
			n = n - d[s[n]];
		}
	}
	private void makeGreedyChoice(Integer items[],int wt) {

		//sort the sackitems
		Arrays.sort(items, Collections.reverseOrder());
		int sack[] = new int[items.length];
		int sum = wt;
		int itemIndex = 0;
		int index = 0;
		boolean notComplete = true;
		//select item one by one
		while(notComplete) {
			int sackItem = items[itemIndex];
			if(sackItem < sum) {
				sum -= sackItem;
				sack[index] = itemIndex;
				index++;
			}
			itemIndex++;
			if(itemIndex == items.length) {
				notComplete = false;
			}
		}
		System.out.println("Remaining sum = "+sum);
		for(int i=0;i<items.length;i++) {
			if(!(sack[i] == 0 && i>0))
				System.out.print(items[sack[i]] +",");
		}
		System.out.println();

	}

	private void extCutRod(int p[],int n) {

		int s[] = new int[n+1];
		int r[] = new int [n+1];
		r[0] = 0;
		for (int i=1;i<=n;i++) {
			int q = Integer.MIN_VALUE;
			for (int j=1;j<=i;j++) {
				if(q < p[j] + r[i-j]) {
					q = p[j] + r[i-j];
					s[i] = j;
				}
				//				q = Math.max(q, p[j] + r[i-j]);

			}
			r[i] = q;
		}


		while(n > 0) {
			System.out.print(s[n] + " \t");
			n = n - s[n];
		}
	}
	private int cutRod(int p[],int n) {

		if(n == 0) {
			return 0;
		}
		int q = Integer.MIN_VALUE;
		for (int i=1;i<=n;i++) {
			q = Math.max(q,p[i] + cutRod(p, n - i));
		}
		return q;
	}


	private int coinsChange(int c[],int w) {

		if (w == 0) {
			return 1;
		}
		//else{
		int coins = Integer.MAX_VALUE;
		for (int i=1;i<c.length;i++) {
			if( w >= c[i])
				coins = Math.min(coins, coinsChange(c, w - c[i]));
		}
		return coins;
		//	}

	}

	private void knapWithoutRec(int []b,int []v,int n) {
		
	}
	
	/**
	 * Knapsack with repetition 
	 * @param b
	 * @param v
	 * @param n
	 */
	private void knapRec(int []b ,int []v,int n) {
		int k[] = new int [n+1];
		int p[] = new int [n+1];
		k[0] = 0;
		System.out.println();
		for (int i=1;i<=n;i++) {
			int max = 0;
			int index = 0;
			for(int j=1;j<=b.length-1;j++) {
				if(b[j] <= i) {	
					if(max < (k[i-b[j]] + v[j])) {
						max = k[i-b[j]] + v[j];
						index = j;
					}
				}
			}
			k [i] = max;
			p[i] = index;
			System.out.print(" "+index);
		}


		//print the coin denomination
		int sum = n;
		System.out.println();
		while(sum > 0) {
			System.out.print(b[p[sum]] + " ");
			sum = sum - b[p[sum]];
		}



	}

	public static void main(String args[]) {
		Integer sackItems[] = {12,34,10,3,4,8};
		int wt = 50;
		Knapsack knap = new Knapsack();
		knap.makeGreedyChoice(sackItems, wt);

		//		Integer coins[] = {1,5,10,25,50}; //30
		////		Integer coins1[] = {1,3,4,5}; //7
		//		Integer coins1[] = {5,4,3,1};
		//		knap.makeChange(coins1 , 12);


		int p [] = {0,1,5,8,9,10,17,17,20,24,30};	//p start from 1
		int val = knap.cutRod(p, 4);
		System.out.println("The max cut value "+val);

		knap.extCutRod(p,7);

		//		int c[] = {0,10,6,1};
		//		int v1 = knap.coinsChange(c, 12);
		//		System.out.println("The max cut value "+v1);
		int b [] = {0,6,3,4,2};
		int v[] = {0,30,14,16,9};
		knap.knapRec(b,v,10);
	}

}
