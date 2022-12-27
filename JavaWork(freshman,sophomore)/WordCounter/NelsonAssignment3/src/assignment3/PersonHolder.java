package assignment3;

public class PersonHolder {
	private Person p1;
	private Person p2;
	private Person p3;
	private Person p4;
	private Person p5;
	
	public void setP1(Person p1) { 
		this.p1 = p1;
	}
	public void setP2(Person p2) {
		this.p2 = p2;
	}
	public void setP3(Person p3) {
		this.p3 = p3;
	}
	public void setP4(Person p4) {
		this.p4 = p4;
	}		
	public void setP5(Person p5) {
		this.p5 = p5;
	}
	
	public void listAll() {
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
		System.out.println(p3.getInfo());
		System.out.println(p4.getInfo());
		System.out.println(p5.getInfo());
	}
	
	public static void main(String[]  args) {
		///Intern int1 = new Intern();
		///int1.setName("Fred Derf");
		///int1.setNickName("Sparky");
		
		Customer cust1 = new Customer();
		cust1.setName("Bob Ross");
		cust1.setPhoneNumber("777 555 7777");
		
		Employee emp1 = new Employee();
		emp1.setName("Tom Brady");
		emp1.setJobTitle("Football Player");
		
		Vendor vend1 = new Vendor();
		vend1.setName("Elon Musk");
		vend1.setCompanyName("Tesla Inc. ");
		
		Customer cust2 = new Customer();
		cust2.setName("Rob Wright");
		cust2.setPhoneNumber("777 777 7777");
		
		Employee emp2 = new Employee();
		emp2.setName("Jordan Son");
		emp2.setJobTitle("CEO of Football Club");
		
		PersonHolder group = new PersonHolder();
		group.setP1(cust1);
		group.setP2(emp1);
		group.setP3(vend1);
		group.setP4(cust2);
		group.setP5(emp2);
		
		
		group.listAll();
		
	}
}
