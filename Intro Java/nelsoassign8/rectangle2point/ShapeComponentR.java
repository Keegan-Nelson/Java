package rectangle2point;

import java.awt.*; 
import java.awt.Graphics2D;
import javax.swing.*;


import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Graphics;

public class ShapeComponentR extends JComponent {
    private Shape theShape;
	
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g; 
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		
	
		g2D.setStroke(new BasicStroke(1)); 
		g2D.setColor(Color.red);
		g2D.setBackground(Color.white);
		g2D.clearRect(0, 0, getWidth(), getHeight());
	
		if(theShape != null) {
			g2D.draw(theShape); 
		}
		
	}

	public void addRectangle(double xmin, double ymin, double width, double height) {
		theShape = new Rectangle2D.Double(xmin, ymin, width, height);
		
		
		repaint();
	}



} 