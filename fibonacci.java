import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fibonacci {
	
	int fibo_rec(int n) {
		if (n <= 1 && n >= 0) {
			return n;
		}else {
			n = fibo_rec(n -1) + fibo_rec(n-2);
		}
		return n;
	}
	
	int fibIterative(int n) {
		int prev = 0;
		int current = 1;
		int ans = 0;
		if(n <= 1) {
			ans = n;
		}
		for(int i = 2;i <= n;i++) {
			ans = prev + current;
			prev = current;
			current = ans;
		}
		
		return ans;
	}

	int factorial_rec(int n) {
		//base case
		int fact = 0;
		if(n == 0) {
			return 1;
		} else {
		  fact = n * factorial_rec(n-1);	
		}
		return fact;
	}

	int factorialIterative(int n) {
		int fact = 1;
		for (int i=2 ; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	
	//fibonaci series 
	public static void main(String args[]){
		fibonacci fib = new fibonacci();
		File file = new File(args[0]);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				int ans = fib.fibIterative(Integer.parseInt(line));
				System.out.println(ans);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "rec Rfactorial for 5 = "+ fib.factorial_rec(5) );
		System.out.println( "Iterative factorial for 5 = "+ fib.factorialIterative(5) );
		
	}
	
	

}
