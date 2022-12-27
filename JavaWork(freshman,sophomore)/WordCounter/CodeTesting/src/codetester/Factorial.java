package codetester;
import java.util.Scanner; 

public class Factorial {

	int result; 
	
	public static int factorial(int n) { 
		
		if(n == 1)
		{
		return 1;
		}
		else {
			return factorial(n-1)*n;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the a number");
		fact = scan.nextInt();
		
         fact = factorial(fact); 
		System.out.println(fact);
	}

}
