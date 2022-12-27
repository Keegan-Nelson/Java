package assignment_1;

public class Car {
	
	private String property;
	public Car( String stl) {
		property = stl;
	}
	public void getProperty() {
		System.out.println(property);
	}
	public static void main(String[] args) {
		Car toyota = new Car("Prius");
		toyota.getProperty();
		
		Car honda = new Car("Civic");
		honda.getProperty();
		
		Car subaru = new Car("Forester");
		subaru.getProperty();
		
	}
}
