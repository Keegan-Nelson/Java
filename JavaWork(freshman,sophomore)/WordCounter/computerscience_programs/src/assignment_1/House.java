package assignment_1;

public class House {
	
	private String property;
	public House( String stl) {
		property = stl;
	}
	public void getProperty() {
		System.out.println(property);
	}
	public static void main(String[] args) {
		House small = new House("Old House");
		small.getProperty();
		
		House average = new House("Modern House");
		average.getProperty();
		
		House big = new House("Fancy House");
		big.getProperty();
				
	}
}
