package assignment3;

 
public class Car {
	
	private String model = "No model";
	private String color = "No color";
	private String size = "Default size";
	private String style = "No style";
	
	public String getModel() { 
		return model;               //getter MODEL 
	}
	public void setModel(String mdl) {   // setter MODEL
		model = mdl;
	}
	public String getColor() {         // getter COLOR
		return color; 
	}
	public void setColor(String clr) { //setter COLOR
		this.color = clr;
	}
	public Car(String clr) {  
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
