package multipleGraphics;
import java.awt.*; 
import java.awt.Graphics2D;
import javax.swing.*;


import java.awt.event.*;
import java.awt.geom.*;
import java.util.Arrays;
import java.util.Random;
import java.awt.Graphics;

public class ShapeComponentM extends JComponent {
    private Shape[] theShape = new Shape[10];
    private Color[] theColors = new Color[10];
    private int count = 0;
	
    
    Random randomGenerator = new Random();
    
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g; 
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		
	
		g2D.setStroke(new BasicStroke(1)); 
		//g2D.setColor();
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(), getHeight());
	
		for(int i = 0; i < theShape.length; i++) {
			if(theShape[i] != null ) {
				
				g2D.setColor(theColors[i]);
				g2D.fill(theShape[i]);
				
				 
			}
			repaint(); 
		}
	
	}
	
	public void growArrayS() {                                // Need them to be different colors 
		Shape[] temp = new Shape[count + 10]; 
		
		for( int i = 0; i < count; i++) {
			temp[i] = theShape[i];
		}
		theShape = temp;
		
	}
  
	public void growArrayC() {
		Color[] temp = new Color[count + 10]; 
		
		for( int i = 0; i < count; i++) { 
			temp[i] = theColors[i]; 
		}
		theColors = temp; 
	}
	public void clearArray() { 
		//Shape.clear(); 
		
     		theShape= new Shape[10];
		count = 0;

	}
	public void addRectangle(double xmin, double ymin, double width, double height) {
		
		if( count < theShape.length) {
			growArrayS(); 
		}
		int red = randomGenerator.nextInt(256);
	    int green = randomGenerator.nextInt(256);
	    int blue = randomGenerator.nextInt(256);
	    Color randomColour = new Color(red,green,blue);
	    
	    theColors[count] = randomColour;
		theShape[count] = new Rectangle2D.Double(xmin, ymin, width, height);
		count++;
		repaint();
	}

	public void clearRect(int i, int j, int width, int height) {
		// TODO Auto-generated method stub
		
		
	}



} 
