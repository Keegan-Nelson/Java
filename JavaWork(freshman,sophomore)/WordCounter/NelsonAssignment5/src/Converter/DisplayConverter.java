package Converter;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class DisplayConverter extends JFrame {

	private JButton Fbutton; // For some reason its making this a static variable (Don't know why?)
	private JButton Cbutton; 
	
	private JTextField FTextField; 
	private JTextField CTextField; 
	
	private Calc converter;
	

	
	
	private class ButtonPressF implements ActionListener { // convert from F to C 
		public void actionPerformed(ActionEvent arg0) { 
			String f = FTextField.getText();
			double fout = Double.parseDouble(f);
			converter.setInputF(fout);
			converter.convertC();
			double outC = converter.getOutputC();
			CTextField.setText(""+outC);
			
		}
	}																					
	
	private class ButtonPressC implements ActionListener {    // convert from C to F 
		public void actionPerformed(ActionEvent arg0) { 
			String c = CTextField.getText(); 
			double cout = Double.parseDouble(c); 
			converter.setInputC(cout);
			converter.convertT();
			double outF = converter.getOutputF(); 
			FTextField.setText(""+outF);
			
			
		}
	}
	
	
	/*
	private class ButtonPress implements ActionListener {
		public void actionPerformed(ActionEvent arg0) { 
			String s = t.getText();
			
			ta.append(s + "\n"); 
	*/
	
public DisplayConverter() 
{
	super(); 
	Container ctPane = getContentPane();
	converter = new Calc();
	
	//Fahrenheit Side 
	//Button
	Fbutton = new JButton("Convert to Celsius");
	Fbutton.addActionListener(new ButtonPressF());
	//TextField
	FTextField = new JTextField(10); 
	
	
	//Celsius Side 
	//Button
	Cbutton = new JButton("Convert to Fahrenheit");
	Cbutton.addActionListener(new ButtonPressC());
	//TextField 
	CTextField = new JTextField(10);
	
	JPanel inPaneltext = new JPanel(); 
	inPaneltext.add(FTextField); 
	inPaneltext.add(CTextField); 
	ctPane.add(inPaneltext, BorderLayout.NORTH);
	JPanel inPanelbutton = new JPanel();	
	inPanelbutton.add(Fbutton);
	inPanelbutton.add(Cbutton);
	ctPane.add(inPanelbutton, BorderLayout.CENTER);
	
	
	
}
public static void main(String[] args) {
	
	DisplayConverter frame = new DisplayConverter();
	
	frame.setTitle("Temperature Converter"); 
	frame.setSize(400, 300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setLocation(300, 300);
	
}
	
}
