package class3Test;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1; 
		int num2;
		int result; 
		
		/* 
		int num1; 
		short snum1;   //small value of a data type 
		long lnum1;	//very very large integer number 
		int num2; 
		int result; 
		float x; 
		double y; //large number of decimal points 
		char c; 
		String s; // string class is used to store senteneces 
		*/
		
		// Need to define the result as a float when dividing 
		// When wanting to find the remainder you need to have the mod sign (%) 
		
		
		/// = num1 / num2; 
		
		//System.out.println("The result will be "+result);
		
		/*
		Scanner scan = new Scanner(System.in);  // reserve space for object scan //system.in will take the default value which is from the keyboard
		System.out.println("Please enter the first number"); 
		num1 = scan.nextInt();
		System.out.println("Please enter the second number"); 
		num2 = scan.nextInt();												// if you use the print without the println then it will be on the same line 
		
		result = num1 + num2; 
		System.out.println(result); 
		
		*/
		// < smaller then 
		// <= smaller then or equal 
		// > greater then 
		// >= greater then or equal 
		/*
		if (num1 == num2) { 			// = is assigning and double == means that it is equal 
			
		}
		else if (num1 < num2) { 
			System.out.println("Number 2 is greater than Number 1");			//Can you if else or switch 
		}
		else {
			System.out.println("Number 1 is greater than Number 2"); 
		}
		*/
		
		int counter; 
		for (counter =0; counter<10; counter++) { // this will end up stopping at 9 if started at 0 
			System.out.println(counter); 
		}									//when you are certain amount the times you want to repeat // if not sure then you use the while loop 
		
		counter =0; 
		while (counter < 10) {
			//body of the while 
			System.out.println(counter); 
			counter++; 
		}
		counter =0; 
		do {							//want this when you want the command to be executed atleast once 
			//body of the while 
			System.out.println(counter); 	// do will execute the body for the condition opposite of the while by itself 
			counter++; 
			
		}
		while(counter<10);
		
		}

		
		// Linear search CODE 
	
	
}
