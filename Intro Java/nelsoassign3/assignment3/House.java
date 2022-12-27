package assignment3;


public class House {
	
	private String location = "Location Unknown";
	private String color = "No color";
	private String size = "Default size";
	private String style = "No style";
	
	public String getLocation() { 
		return location;               //getter LOCATION
	}
	public void setLocation(String loca) {   // setter LOCATION
		location = loca;
	}
	public String getColor() {         // getter COLOR
		return color; 
	}
	public void setColor(String clr) { //setter COLOR
		this.color = clr;
	}
	public House(String clr) {  
		color = clr;
	}
	public String getSize() {  // getter SIZE
		return size;
	}
	public void setSize(String sze) { //setter SIZE
		size = sze; 
	}
	public String getStyle() {   // getter STYLE 
		return style;
	}
	public void setStyle(String str) {  // setter STYLE
		style = str;
	}
	public static void main(String[] args) { 
	
	}
	
}
