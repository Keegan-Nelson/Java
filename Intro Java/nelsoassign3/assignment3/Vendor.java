package assignment3;

public class Vendor extends Person{
	private String companyName = "no name";
	
	public String getInfo() { 
		return "Vendor"+" "+super.getInfo()+"  company = "+companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
