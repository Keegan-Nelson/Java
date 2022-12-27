package LinkedList;

public class linkList {

	private int index; 
	private Node head; 
	
	
	private class Node { 
		private int theData; 
		Node next; 
	}
	//SEARCHING Function for Linked List
	public int searchNode(int x) { 
		Node currentNode = head; 
		int currentIndex = 1; 
		while(currentNode != null && currentNode.theData != x) {
			currentNode = currentNode.next; 
			currentIndex++; 
		}
		if(currentNode == null ) return 0; 
		return currentIndex; 
	}
	//REMOVING Function for Linked List 
	public int removeNode(int x) { 
		Node previousNode = null; 
		Node currentNode = head; 
		int currentIndex = 1; 
		while(currentNode != null && currentNode.theData != x) { 
			previousNode = currentNode; 
			currentNode = currentNode.next; 
			currentIndex++;
		}
		if(currentNode != null){
			if(previousNode != null) {
				previousNode.next = currentNode.next; 
			}
			else head = currentNode.next; 
			return currentIndex; 
		}
		return 0; 
	}
	//ADDing Function for Linked list 
	public Node addNode(int index, int x) {
		Node newNode = new Node(); 
		newNode.theData = x; 
		if(index < 0) return null; 
		int currentIndex = 1; 
		Node currentNode = head; 
		while(currentNode != null && index > currentIndex) {
			currentNode = currentNode.next; 
			currentIndex++;
			System.out.println("Current Index: " + currentIndex); 
		}
		if(index == 0) {
			newNode.next = head; 
			head = newNode; 
		}
		else {
			newNode.next = currentNode.next; 
			currentNode.next = newNode; 
		}
		return newNode;
	}
	// TRAVERSING Function for Lniked List 
	private void TraverseNodes(Node node) {
		if(node != null) {
			TraverseNodes(node.next);
			System.out.print(node.theData);
		}
		return; 
	}
}
