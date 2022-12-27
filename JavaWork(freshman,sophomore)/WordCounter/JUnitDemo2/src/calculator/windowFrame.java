package calculator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class windowFrame extends JFrame {

	private Calc display; 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Need to have the Calculator code for the operations here 

//Addition 

//Subtraction 

//Multiplication 

//Division 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
private JButton Pbutton;
private JButton Sbutton; 
private JButton Mbutton; 
private JButton Dbutton; 

private JTextField TextField1; 
private JTextField TextField2; 
private JTextArea AnswerField; 



/*
private class ButtonPressP implements ActionListener { // Plus Button 
public void actionPerformed(ActionEvent arg0) { 
String i1 = TextField1.getText();
String i2 = TextField2.getText(); 
double i1out = Double.parseDouble(i1);
double i2out = Double.parseDouble(i2);    //double i2 = Double.parseDouble( TextField1.getText());
calcFrame1.setInputi1(i1);
calcFrame1.setInputi2(i2); 
calcFrame1.plus();
double outC = calcFrame1.getOutputC();     // NEED TO WORK WITH THESE LAST FEW LINES OF CODE FOR ALL 4 ACTION LISTENERS
CTextField.setText(""+outC);

}
}																					
/*
private class ButtonPressS implements ActionListener {    // Subtraction Button 
public void actionPerformed(ActionEvent arg0) { 
String i1 = TextField1.getText(); 
String i2 = TextField2.getText();
double i1out = Double.parseDouble(i1);
double i2out = Double.parseDouble(i2);
calcFrame1.setInputi1(i1);
calcFrame1.setInputi2(i2); 
calcFrame1.subtract();
double outF = calcFrame1.getOutputF(); 
TextField2.setText(""+outF);


}
}
private class ButtonPressM implements ActionListener {    // Multiplication Button 
public void actionPerformed(ActionEvent arg0) { 
String i1 = TextField1.getText(); 
String i2 = TextField2.getText();
double i1out = Double.parseDouble(i1);
double i2out = Double.parseDouble(i2); 
calcFrame1.setInputi1(i1);
calcFrame1.setInputi2(i2); 
calcFrame1.multiply();
double outF = calcFrame1.getOutputF(); 
TextField2.setText(""+outF);


}
}
private class ButtonPressD implements ActionListener {    // Divide Button 
public void actionPerformed(ActionEvent arg0) { 
String i1 = TextField1.getText(); 
String i2 = TextField2.getText();
double i1out = Double.parseDouble(i1);
double i2out = Double.parseDouble(i2); 
calcFrame1.setInputi1(i1);
calcFrame1.setInputi2(i2); 
calcFrame1.divide();
double outF = calcFrame1.getOutputF(); 
TextField2.setText(""+outF);


}
}
*/
public windowFrame() 
{
super(); 
Container ctPane = getContentPane();
display = new Calc();

//Plus Buttom  
Pbutton = new JButton("+");
Pbutton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
Calc thecalc = new Calc();
double i2 = Double.parseDouble( TextField1.getText());
}
});
//Button Subtraction Button 
Sbutton = new JButton("-");
//Multiply Button 
Mbutton = new JButton("*"); 
//Divide Button 
Dbutton = new JButton("/"); 


//Pbutton.addActionListener(new ButtonPressP());  //adding an action listener to each button 
//Sbutton.addActionListener(new ButtonPressS());
//Mbutton.addActionListener(new MuttonPressM());
//Dbutton.addActionListener(new ButtonPressD());


//TextFields & Areas 
TextField1 = new JTextField(10); 
TextField2 = new JTextField(10);
AnswerField = new JTextArea(10,30); 

JPanel inPanelinput = new JPanel(); 
inPanelinput.add(TextField1); 
inPanelinput.add(TextField2); 
ctPane.add(inPanelinput, BorderLayout.NORTH);
JPanel inPanelAnswer = new JPanel(); 
inPanelAnswer.add(AnswerField); 
ctPane.add(inPanelAnswer, BorderLayout.CENTER);
JPanel inPanelbutton = new JPanel();	
inPanelbutton.add(Pbutton);
inPanelbutton.add(Sbutton);
inPanelbutton.add(Mbutton); 
inPanelbutton.add(Dbutton); 
ctPane.add(inPanelbutton, BorderLayout.SOUTH);



}
public static void main(String[] args) {

windowFrame frame = new windowFrame();

frame.setTitle("Super Calculator"); 
frame.setSize(400, 300);
frame.setVisible(true);
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
frame.setLocation(300, 300);

}

}
