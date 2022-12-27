package holidaySymbol;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.*; 

import javax.swing.JComponent;

public class ShapeComponentH extends JComponent{

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		
		Graphics2D g2D = (Graphics2D) g; 
		
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(),getHeight()); 
		g2D.setColor(Color.green);
		
		// LINES // 
		Shape line1 = new Line2D.Double(10,10,10,100); 
		Shape line2 = new Line2D.Double(10,55,50,55); 
		Shape line3 = new Line2D.Double(50,10,50,100);       // LINE ( x,y,x,y) 			Will graph two points and then draw a line between both
		Shape line4 = new Line2D.Double(115,10,115,100); 
		Shape line5 = new Line2D.Double(140,55,140,100); 
		Shape line6 = new Line2D.Double(180,10,180,100); 
		Shape line7 = new Line2D.Double(205,60,220,100); 
		Shape line8 = new Line2D.Double(235,60,250,100); 
		Shape line9 = new Line2D.Double(250,115,250,60); 
		
		// CIRCLES // 
		
		Shape Circle1 = new Ellipse2D.Double(75,60,20,40); 
		Shape Circle2 = new Ellipse2D.Double(137,30,10,10);   // Circle  ( x, y, width, height) 
		Shape Circle3 = new Ellipse2D.Double(160,60,20,40);
		Shape Circle4 = new Ellipse2D.Double(190,60,20,40);
		
		// DRAWING // 
		g2D.draw(line1);  
		g2D.draw(line2);
		g2D.draw(line3);
		g2D.draw(line4);
		g2D.draw(line5);
		g2D.draw(line6);
		g2D.draw(line7);
		g2D.draw(line8);
		g2D.draw(line9);
		g2D.draw(Circle1);
		g2D.fill(Circle2);
		g2D.draw(Circle3);
		g2D.draw(Circle4);
		
		
		
		
		
	}
	
	

}
