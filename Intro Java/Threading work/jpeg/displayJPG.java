package jpeg;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.image.Image;

import javax.swing.JList;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

class displayJPG extends JFrame {

	
	static HashMap<String, String> mp = new HashMap<String, String>();
	
	DefaultListModel<String> model = new DefaultListModel<>();
	JList<String> list = new JList<>(model);
	
	static Vector pictures = new Vector(); 
	ImageIcon icon = new ImageIcon("avocado.jpeg");
	

	private JTextArea txtrDisplayImageBeing;

	private JFileChooser fileChooser; 
	private JPanel contentPane;
	private static JLabel displayLabel; 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		displayJPG display = new displayJPG();
	
		pictures.addElement("Avocado");
		pictures.addElement("Banana");
		pictures.addElement("Dice");
		mp.put("Banana", "Banana.jpg");
		mp.put("Dice", "dice.jpg");
		mp.put("Avocado", "avocado.jpg");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayJPG frame = new displayJPG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void addMap() {
		txtrDisplayImageBeing.getText(); 
		if(txtrDisplayImageBeing.getText() == "Banana.jpg" ) {
			mp.put("Banana", "banana.jpg");
		}
		else if(txtrDisplayImageBeing.getText() == "avocado.jpeg") {
			mp.put("Avocado", "avocado.jpeg");
		}
		else if(txtrDisplayImageBeing.getText() == "dice.jpg") {
			mp.put("Dice", "dice.jpg");
		}
		
		
		// Will display the map in a text area below once stuff is added 
	}
	
	MouseListener mouseListener = new MouseListener() {
		public void mouseClicked(MouseEvent arg0) { 
			if(arg0.getClickCount() == 2) {
				String selectedItem = (String) list.getSelectedValue(); 
				txtrDisplayImageBeing.setText("Image being Displayed: " + selectedItem);
				
				JFileChooser chooser = new JFileChooser(); 
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getName();
				txtrDisplayImageBeing.setText(filename);
				String path = f.getAbsolutePath(); 
				//displayLabel.setIcon(icon);
				// This will display the image when the file name is opened: 
				//Image image = ImageIO.read(f);
				
				//displayJPG.this.validate();   // might need this 
			
				ImageIcon image = new ImageIcon(path);
				displayLabel.setIcon(image);
				
			}
		}
 
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	/**
	 * Create the frame.
	 */
	public displayJPG() {
		setTitle("DisplayImage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JList list = new JList(listModel);
		list = new JList(pictures);
		list.setBounds(23, 33, 166, 132);
		list.addMouseListener(mouseListener);
		contentPane.add(list);
		
		txtrDisplayImageBeing = new JTextArea();
		txtrDisplayImageBeing.setText("Image Name Being Displayed");
		txtrDisplayImageBeing.setBounds(359, 7, 213, 27);
		contentPane.add(txtrDisplayImageBeing);
		
		displayLabel = new JLabel(/*icon*/);	//Need help displaying an image 
		displayLabel.setBounds(282, 45, 401, 261);
		contentPane.add(displayLabel);
		
		JLabel TitleofList = new JLabel("List of Images to Display");
		TitleofList.setBounds(24, 12, 165, 14);
		contentPane.add(TitleofList);
		
		JTextArea txtrDoubleClickName = new JTextArea();
		txtrDoubleClickName.setText("Double Click Name to Find File");
		txtrDoubleClickName.setBounds(0, 173, 272, 22);
		contentPane.add(txtrDoubleClickName);
	}
	

}
