package test;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
public class codeTest {
	
	public static void main(String[] a) {
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JTextField jTextField1 = new JTextField();

	    jTextField1.setText("jTextField1");
	    jTextField1.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        System.out.println("action");
	      }
	    });
	    frame.add(jTextField1);

	    frame.setSize(300, 200);
	    frame.setVisible(true);
	  }
}


JTextField userID;   // declare a field
. . .
userID = new JTextField(8); // create field approx 8 columns wide.
p.add(userID);              // add it to a JPanel

userID.addActionListener(
    new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ... // THIS CODE IS EXECUTED WHEN RETURN IS TYPED
        }
    }
);