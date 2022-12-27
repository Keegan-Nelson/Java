import java.util.Scanner; 

public class prac {

	
	public static int sum(int[] arr) { 						//change void into int because you are returning a value int 
		int sum = 0; 
		int count;
		int size = arr.length; 
		for(count=0; count<size; count++) {      //Header of for loop 
			sum = sum + arr[count]; 							//Body of for loop 
		}
		
		return sum; 
	}
	public static void print(int[] arr) {
		int count;
		int size = arr.length; 
		for(count=0; count<size; count++) {
			System.out.println(arr[count]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[10];
		int count; 
		int res;
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please Enter 10 Numbers"); 
		
		for(count=0; count<10; count++) {
			arr[count] = scan.nextInt(); 
		}
		
		print(arr);
		res = sum(arr); 
		
		System.out.println("Result="+res); 
	}

}
