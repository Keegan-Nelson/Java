package assignment3;

public class Employee extends Person {
	private String jobTitle = "no job"; 
	
	public void setJobTitle(String jobTitle) { 
		this.jobTitle = jobTitle;
	}
	
	public String getInfo() { 
		return "Employee"+" "+super.getInfo()+" My Job is "+jobTitle;
	}
}
