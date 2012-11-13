package com.ub.dynamic;

public class RabbitFibo {

	public final int UNKNOWN = -10;
	long [] f;
	int iter;
	public RabbitFibo() {
				
	}
	
	public void calculateFib(int n) {
		this.iter = n;
		f = new long[n + 1];
		fib_c_driver();
	}
	
	private long fib_c(int n)
	{
		if (f[n] == UNKNOWN)
			f[n] = fib_c(n-1) + fib_c(n-2);
		return(f[n]);
	}
	
	private long fib_c_driver()
	{
		int i; /* counter */
		f[0] = 0;
		f[1] = 1;
		for (i=2; i<= iter ; i++) f[i] = UNKNOWN;
		return(fib_c(iter));
	}
}
