package jumpingJacks;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import holidaySymbol.ShapeComponentH;
import holidaySymbol.ShapeFrameH;

public class JumpingJackerFrame extends JFrame {
	private jumpingJacker jumpingDisplay; 
	private JButton move; 
	private Timer theTimer; 						// Graphics 4 for help   end of the chapter / bottom of the page
	
	
	private class Animate implements ActionListener { 
		public void actionPerformed(ActionEvent e) { 
			jumpingDisplay.go();
			
		}
	}
	
	
	private class StartJumping implements ActionListener { 
		public void actionPerformed(ActionEvent e ) { 
			theTimer.start();
			
			
		}
	}
//	private class 
	
	public JumpingJackerFrame() { 
		
	//	b = new JButton("Add Item");
		//b.addActionListener(new ButtonPress());
		super(); 
		Container ctPane = getContentPane();
		move = new JButton("Make Stick Figure Do Jumping Jacks"); 
		move.addActionListener(new Animate());
		jumpingDisplay = new jumpingJacker(); 
		ctPane.add(jumpingDisplay, "Center"); 
		ctPane.add(move,BorderLayout.SOUTH);
		
		// need to add a button and then associate it with the action listener and then put in in a panel so that its on the GUI 
	}
	
	public static void main(String[] args) { 
		JumpingJackerFrame frame = new JumpingJackerFrame(); 
		frame.setSize(400,400);
		frame.setLocation(400,200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
