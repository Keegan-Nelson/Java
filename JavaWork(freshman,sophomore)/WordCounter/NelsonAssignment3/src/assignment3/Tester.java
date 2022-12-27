package assignment3;

public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Car:");
		Car mack = new Car("Speedy");
		mack.setColor("Red");
		mack.setModel("Toyota");
		System.out.println(mack.getModel());
		System.out.println(mack.getColor());
		System.out.println(mack.getStyle());
		System.out.println(mack.getSize());
		
		
		System.out.println("-------");
		
		
		System.out.println("House:");
		House milly = new House("Living Space");
		milly.setLocation("Colorado");
		milly.setColor("Tan");
		System.out.println(milly.getLocation());
		System.out.println(milly.getColor());
		System.out.println(milly.getStyle());
		System.out.println(milly.getSize());

		
	}

}
