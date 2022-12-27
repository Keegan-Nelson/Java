package assignment3;

public class Customer extends Person {
	private String phoneNumber = "000 000 0000";
	
	public void setPhoneNumber(String phoneNumber) { 
		this.phoneNumber = phoneNumber; 
	}
	
	public String getInfo() { 
		return "Customer"+" "+super.getInfo() + "--->" + phoneNumber; 
	}
}
