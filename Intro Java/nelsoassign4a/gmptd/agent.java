package gmptd;

public class agent {

	private int totalPeople = 0; 
	private int totalVehicles = 0; 
	private int moneyCollected = 0;
	
	public void takeToll1(Vehicle Car) { 
		totalVehicles = totalVehicles + 1; 
		totalPeople = totalPeople + Car.getPeople(); 
		moneyCollected = moneyCollected + Car.getMoneyCar();
	}
	public void takeToll2(Vehicle Truck) { 
		totalVehicles = totalVehicles + 1; 
		totalPeople = totalPeople + Truck.getPeople(); 
		moneyCollected = moneyCollected + Truck.getMoneyTruck();
	}
	public void takeToll3(Vehicle Bus) { 
		totalVehicles = totalVehicles + 1; 
		totalPeople = totalPeople + Bus.getPeople(); 
		moneyCollected = moneyCollected + Bus.getMoneyBus();
	}
	public double getAveragePerPerson() { 
		return moneyCollected*1.0/totalPeople; 
	}

	public int getTotalPeople() {
		return totalPeople;
	}


	public int getTotalVehicles() {
		return totalVehicles;
	}


	public int getMoneyCollected() {
		return moneyCollected;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agent a = new agent(); 
		
		Car car1 = new Car(1); 
		a.takeToll1(car1);  
		
		System.out.println("One Car with 1 Person Passes By: ");
		System.out.print("Total People: ");
		System.out.println(a.getTotalPeople()); 
		System.out.print("Total Vehicles: ");
		System.out.println(a.getTotalVehicles()); 
		System.out.print("Total Money Collected: ");
		System.out.println(a.getMoneyCollected());
		System.out.print("Average Money Per Person: ");
		System.out.println(a.getAveragePerPerson());
		
		System.out.println("--------------------------");
		
		Car truck1 = new Car(1); 
		a.takeToll2(truck1);
		
		System.out.println("One Truck with 1 Person Passes By: ");
		System.out.print("Total People: ");
		System.out.println(a.getTotalPeople()); 
		System.out.print("Total Vehicles: ");
		System.out.println(a.getTotalVehicles()); 
		System.out.print("Total Money Collected: ");
		System.out.println(a.getMoneyCollected());
		System.out.print("Average Money Per Person: ");
		System.out.println(a.getAveragePerPerson());
		
		System.out.println("--------------------------");
		
		Car bus1 = new Car(2);
		a.takeToll3(bus1);
		
		System.out.println("One Truck with 2 Person Passes By: ");
		System.out.print("Total People: ");
		System.out.println(a.getTotalPeople()); 
		System.out.print("Total Vehicles: ");
		System.out.println(a.getTotalVehicles()); 
		System.out.print("Total Money Collected: ");
		System.out.println(a.getMoneyCollected());
		System.out.print("Average Money Per Person: ");
		System.out.println(a.getAveragePerPerson());
		
	}

}
      