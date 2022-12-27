package rectangle2point;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
public class ShapeFrameR extends JFrame{
	
	private ShapeComponentR shapeDisplay; 
	private boolean firstClick = true;
	private double firstX;
	private double firstY;
	
	private double secondX; 
	private double secondY; 
	private class DrawRec implements MouseListener{ 
		public void mouseClicked(MouseEvent arg0) { 
			double clickX = arg0.getX(); 
			double clickY = arg0.getY(); 
			
			
			if(firstClick) {
				firstX = clickX; 
				firstY = clickY; 
				firstClick = false;
			}
			else {
				secondX = clickX; 
				secondY = clickY; 
				
				
				double xmin = Math.min(firstX, secondX);
				double xmax = Math.max(firstX, secondX); 
	
				double width = xmax - xmin;
				
				double ymin = Math.min(firstY, secondY);
				double ymax = Math.max(firstY, secondY); 
				
				double height = ymax - ymin; 
				
				
				
				shapeDisplay.addRectangle(xmin,ymin,width,height);
				firstClick = true;
			} 
			
		}

		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {} 
		public void mousePressed(MouseEvent arg0) {} 
		public void mouseReleased(MouseEvent arg0) {} 
		
	}

		public ShapeFrameR() { 
			super(); 
			Container ctPane = getContentPane();
			shapeDisplay = new ShapeComponentR(); 
			shapeDisplay.addMouseListener(new DrawRec());
			ctPane.add(shapeDisplay, "Center"); 
			
			
		}
		
		public static void main(String[] args) { 
			ShapeFrameR frame = new ShapeFrameR(); 
			frame.setSize(400,400);
			frame.setLocation(400,200);
			frame.setVisible(true); 
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}
}
