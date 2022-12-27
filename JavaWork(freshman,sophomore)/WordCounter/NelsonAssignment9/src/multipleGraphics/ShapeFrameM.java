package multipleGraphics;

import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;
import java.awt.event.*;

public class ShapeFrameM extends JFrame{
	
	private JButton Clear; 
	
	private ShapeComponentM shapeDisplay; 
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

	
	private class Reset implements ActionListener { 
		public void actionPerformed(ActionEvent a) {
			
			shapeDisplay.clearArray();
		}
	}
		public ShapeFrameM() { 
			super(); 
			Container ctPane = getContentPane();
			shapeDisplay = new ShapeComponentM(); 
			shapeDisplay.addMouseListener(new DrawRec());
			ctPane.add(shapeDisplay, "Center"); 
			Clear = new JButton("Reset");
			Clear.addActionListener(new Reset());
			ctPane.add(Clear,BorderLayout.SOUTH);
			
		}
		
		public static void main(String[] args) { 
			ShapeFrameM frame = new ShapeFrameM(); 
			frame.setSize(400,400);
			frame.setLocation(400,200);
			frame.setVisible(true); 
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}
}
