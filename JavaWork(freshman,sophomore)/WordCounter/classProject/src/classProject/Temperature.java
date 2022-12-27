package classProject;

public class Temperature {
private float temp; 

public Temperature(float temp) { 
	this.temp = temp; 
}

public void setTemp(float temp) {
	this.temp = temp; 								// can set the value multiple times
}

public float getTemp() { 
	return temp; 
}

public void print() { 
	System.out.println("Todays Temperature is"+ temp);
}

public float convert() {
	float tempC; 
	
	tempC = 5*(temp-32)/9; 
	
	//System.out.println("The Celsius Tempurature is:"+tempC); 
	
	return tempC; 
}
}
