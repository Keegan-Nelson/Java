package SIMPLENIM;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;



public class simpleNim extends JFrame {

	
	private class Calc {
		
		private double humanInput; 

		private double humanOutput;
		
		public double getOutputHUMAN() { 
			return humanOutput; 
		}
		
		public void sethumanInput(Double input) {
			humanInput = input; 
		}
		
		
		public double humanTaker() { 
			return humanOutput = (peb - humanInput); 
		}
	}
///////////////////////////////////////////////////////////////////////////////////////	

	// INTERFACE FOR THE CALCULATIONS // 
	
	
//////////////////////////////////////////////////////////////////////////////////////////
	
	//private static int randint(int i) {
////		return 0;  //When Switch this to i its stuck at 51 for the random int  DOnt think I need this anymore 
	//}
	
	// VARIABLE INITIATION // 
	private JTextArea dialogue;
	private JButton pebbleTaker ; 
	private JTextField pebbleRemaining; 
	private JTextField pebbleHUMAN; 
	private JButton Restart;	
	private Calc simplenim;
	private Random gen = new Random();
	public int peb = gen.nextInt(42)+ 9;  
	
		 
/////////////////////////////////////////////////////////////////////////////////////////	

public simpleNim() {
super();   
	
	Container ctPane = getContentPane(); 
	JPanel jPan = new JPanel();
	
	 // BOTTOM //
	Restart = new JButton("Restart Game");
	jPan.add(Restart);
	Restart.addActionListener(new buttonRestart());
	pebbleTaker = new JButton("Take Pebbles");
	jPan.add(pebbleTaker);
	pebbleTaker.addActionListener(new ButtonPressHuman());
	pebbleHUMAN = new JTextField(5);
	jPan.add(pebbleHUMAN); 													
	ctPane.add(jPan,BorderLayout.SOUTH);
	
	
	 // FIELDS AND AREAS // 
	dialogue = new JTextArea(); 
	dialogue.setLineWrap(true);
	JScrollPane Scroll = new JScrollPane(dialogue); 
	ctPane.add(Scroll,BorderLayout.CENTER);
	
	pebbleRemaining = new JTextField();
	ctPane.add(pebbleRemaining,BorderLayout.NORTH);

	pebbleRemaining.setText(peb +"");
	dialogue.append("Welcome to the game nigga" + "\n");
	//dialogue.append("Enter Number In Box Below. Number Cannot Be > Half Of Pebbles" + "\n");
}




private class ButtonPressHuman implements ActionListener {
	public void actionPerformed(ActionEvent arg0)  {
		String h = pebbleHUMAN.getText(); 
		int hOut = Integer.parseInt(h);          // ONCE THSIS IS PRESSED IT NEEDS the AI to also take pebbles right after 
		
	//	if( hOut == 1) {
	//		dialogue.append("You Lose");
			//break;  // BREAK STATEMENT DOESN"T WORK 
	
	//	}
		if(peb == 1) {
			dialogue.append("You lose" + "\n");
		}
		else if ( hOut > peb /2 ) {
			dialogue.append("Number Cannot Be Greater Than Half Of Remaining Pebbles" + "\n"); //complain
		}
		else {
			peb = peb - hOut;
			int programTaker1;
			int programTaker2; 
			int programTaker3;
			int programTaker4;
			int programTaker5; 
			int programTakes1;
			programTakes1 = 1; 
	 
			pebbleRemaining.setText(""+peb);      // might need to set the text to a string every time 
			dialogue.append("You Take " + hOut + " Pebbles, Remaining Pebbles = " + peb +"\n");
		
			if( peb > 31 )	{
				programTaker1 = peb -31;
				peb = peb - programTaker1;
				pebbleRemaining.setText(""+peb);
				dialogue.append("Computer Takes " + programTaker1 + " Pebbles, Remaining Pebbles = " + peb + "\n");
				dialogue.append("YOUR TURN" + "\n");
			}
		    
			else if(peb == 31) { 
				peb = peb - programTakes1;
				pebbleRemaining.setText(""+peb);
				dialogue.append("Computer Takes 1 Pebbles, Remaining Pebbles = 30" + peb + "\n");
				dialogue.append("YOUR TURN" + "\n");
			}
		 	else if(peb > 15) {     
		 		programTaker2 = peb -15; 
		 		peb = peb - programTaker2;
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes " + programTaker2 + " Pebbles, Remaining Pebbles = " + peb + "\n");
		 		dialogue.append("YOUR TURN" + "\n");
		 	}
		 	else if(peb == 15) { 
		 		peb = peb - programTakes1;
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes 1 Pebbles, Remaining Pebbles = 14" + peb + "\n");
		 		dialogue.append("YOUR TURN" + "\n");
		 	}
		 	else if(peb > 7) {
		 		programTaker3 = peb -7;
		 		peb = peb - programTaker3; 
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes " + programTaker3 + " Pebbles, Remaining Pebbles = " + peb + "\n");
		 		dialogue.append("YOUR TURN" + "\n");
		 	}                                            
		 	else if(peb == 7) {
		 		peb = peb - programTakes1; 
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes 1 Pebbles, Remaining Pebbles = 6" + peb + "\n");
		 		dialogue.append("YOUR TURN" + "\n");
		 	}
		 	else if(peb > 3) {
		 		programTaker4 = peb -3;
		 		peb = peb - programTaker4;
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes " + programTaker4 + " Pebbles, Remaining Pebbles = " + peb + "\n");
		 		dialogue.append("YOUR TURN" + "\n");
		 	}
		 	else if(peb ==3) {
		 		peb = peb -programTakes1; 
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes 1 Pebbles, Remaining Pebbles = 2" + peb + "\n");
		 		dialogue.append("YOUR TURN" + "\n");
		 	}
		 	else if(peb > 1) {
		 		programTaker5 = peb -1;
		 		peb = peb - programTaker5;
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes " + programTaker5 + " Pebbles, Remaining Pebbles = " + peb + "\n");
		 		dialogue.append("YOUR TURN" + "\n");
		 	}
		 	else if(peb == 1) {
		 		peb = peb - programTakes1;
		 		pebbleRemaining.setText(""+peb);
		 		dialogue.append("Computer Takes 1 Pebbles, Remaining Pebbles = " + peb + "\n");
		 		dialogue.append("You Have Won!" + "\n");
		 		dialogue.append("Press Restart To Play Again" + "\n");
		 	}
		 	else if(peb == 0) {
		 		dialogue.append("Remaining Pebbles = 0" + "\n");
		 		dialogue.append("AI Has Won" + "\n");
		 		dialogue.append("Press Restart To Play Again" + "\n");
		 	
		 	}
			
	}
		
	}
	
}


private class buttonRestart implements ActionListener {         // BUTTON TO RESTART THE GAME 
	public void actionPerformed(ActionEvent arg0) {
		
		peb = gen.nextInt(42)+ 9;
		
		pebbleRemaining.setText(""+peb);
		dialogue.setText("");
	}
			
}

public static void main(String[] args) {    								

 //////////////////////////////////////////////////////////////////////////////////////////
 
 	// GUI //
 
 simpleNim frame = new simpleNim();
 
	frame.setTitle("Simple NIM"); 
	frame.setSize(400, 300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setLocation(300, 300);
///////////////////////////////////////////////////////////////////////////////////////////	
}

}
