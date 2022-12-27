package gmptd;

public class Car implements Vehicle {
	private int moneyCar = 1; 
	private int moneyTruck = 2;
	private int moneyBus = 5; 
	private int numofPeople; 
	
	public Car(int numofPeople) {
		this.numofPeople = numofPeople; 
	}
	public int getMoneyCar() {
		return moneyCar;
	}
	public int getMoneyTruck() {
		return moneyTruck;
	}
	public int getMoneyBus() {
		return moneyBus;
	}
	
	public int getPeople() { 
		return numofPeople;
	}
}
