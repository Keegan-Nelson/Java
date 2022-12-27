package ShoppingList;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DisplayShopping extends JFrame {

	private JButton b; 
	private JTextField t; 
	private JTextArea ta; 
	
	
	private class ButtonPress implements ActionListener {
		public void actionPerformed(ActionEvent arg0) { 
			String s = t.getText();
			ta.append(s + "\n"); 
		}
		
	}
	
	
	public DisplayShopping()
	{
		super(); 
		Container ctPane = getContentPane();
		
		b = new JButton("Add Item");
		b.addActionListener(new ButtonPress());
		t = new JTextField();
		ta = new JTextArea(); 
		
		ctPane.add(b,BorderLayout.SOUTH); 
		ctPane.add(t,BorderLayout.NORTH); 
		ctPane.add(ta,BorderLayout.CENTER); 
		
		
	} 
	
	public static void main(String[] args) { 
		
		DisplayShopping frame = new DisplayShopping();
		frame.setTitle("Shopping List"); 
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocation(300, 300);
		
		
	}
	
}