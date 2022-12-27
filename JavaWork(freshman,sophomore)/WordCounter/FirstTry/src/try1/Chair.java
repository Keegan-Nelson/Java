package try1;

public class Chair {
	private String style;
	public Chair( String stl) {
		style = stl;
	}	
	public void getStyle() {
		System.out.println(style);
	}
	public static void main(String[] args) {
		
		Chair mack = new Chair("Recliner"); 
		mack.getStyle();
		
		Chair milly = new Chair("Rocking");
		milly.getStyle();
	}

}

/*
public Chair(String stl)  {
	style - stl;
}

public static void main(String[] args)  {
Chair mack = new Chair("Log");
System.out.println(mack.getStyle());
System.iut.println(mack.getColor());
mack.setColor("Pickle");
mack.setColor("Office");



*/


