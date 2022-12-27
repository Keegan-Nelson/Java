package LinkedList;

import java.util.Scanner; 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkList L = new linkList(); 
		Scanner scan  = new Scanner(System.in); 
		//NEED TO ADD an add method to the linkList class 
		//Need to make it so that it takes 10 different numbers for the user to input in the class
		L.add(scan); //Need to add the index aswell as the data in the index. 
		L.traverseNodes(); 
		
		// WANT TO ADD !0 numbers also need a node for traverse to go through
	}

}
