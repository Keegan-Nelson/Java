package codetester;

import java.util.Scanner;

public class Fibonacci {
	int result; 
	public static int fibonacci(int n) { 
		
		if(n == 0) { 
			return 0;
		}
		else if(n == 1 ) {
			return 1; 
		}
		else { 
			return fibonacci(n-1) + fibonacci(n-2); 
		}	
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int fibo; 
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the a number");
			fibo = scan.nextInt();
			
	        fibo = fibonacci(fibo); 
			System.out.println(fibo);
		}
			
}
