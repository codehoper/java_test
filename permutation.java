package com.ub.test;

class permutations
{	
	static boolean finished = false;
	static final int MAXCANDIDATES = 100;
	static final int NMAX = 100;
	static void backtrack(int a[], int k, int input)
	{
		int c[] = new int [MAXCANDIDATES];
		int ncandidates, i;
		if (is_a_solution(a,k,input))
			process_solution(a,k,input);
		else
		{
			k++;
			ncandidates = construct_candidates(a,k,input,c);
			for (i=0; i<ncandidates; i++) {
				a[k] = c[i];
//				make_move(a,k,input);
				backtrack(a,k,input);
				if (finished) return;
//				unmake_move(a,k,input);
			}
		}
	}
	static void make_move(int a[],int k,int n)
	{
	}
	static void unmake_move(int a[],int k,int n)
	{
	}
	static void process_solution(int a[],int k, int n)
	{
		for(int i=1;i<=k;i++)
			System.out.printf(" %d",a[i]);
		System.out.printf("\n");
	}
	static boolean is_a_solution(int a[],int k,int n)
	{
		return k==n;
	}
	static int construct_candidates(int a[],int k,int n, int c[])
	{
		System.out.print("{");
		for (int i=1;i<=3;i++) {
			System.out.print( " " +a[i] + " ");
		}
		System.out.print("}" + "\n");
		boolean in_perm[] = new boolean[NMAX];
		for(int i=1;i<NMAX;i++)
			in_perm[i] = false;
		for(int i=1;i<k;i++)
			in_perm[a[i]] = true;
		int ncandidates = 0;
		for(int i=1;i<=n;i++)
			if(!in_perm[i])
			{
				c[ncandidates] = i;
				ncandidates++;
			}
		return ncandidates;
	}
	static public void main(String[] args)
	{
		int a[] = new int[NMAX];
		backtrack(a,0,3);
	}
}