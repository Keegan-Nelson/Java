package holidaySymbol;

import java.awt.*; 
import javax.swing.*;

public class ShapeFrameH extends JFrame{
	
	private ShapeComponentH shapeDisplay; 
	
	
	
	public ShapeFrameH() { 
		super(); 
		Container ctPane = getContentPane(); 
		shapeDisplay = new ShapeComponentH(); 
		ctPane.add(shapeDisplay, "Center"); 
	}

	
	public static void main(String[] args) { 
		ShapeFrameH frame = new ShapeFrameH(); 
		frame.setSize(1000,200);
		frame.setLocation(200,100);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
