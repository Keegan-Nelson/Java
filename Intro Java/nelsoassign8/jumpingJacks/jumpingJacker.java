package jumpingJacks;
import java.awt.*;
import javax.swing.*; 
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double; 
public class jumpingJacker extends JComponent {
	private int step = 0; 
	
	public jumpingJacker() { 
		super(); 
	}
	
	public void go() { 
		repaint(); 
	}
	
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g; 
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		
		Color tan = new Color(153-102-0);
		g2D.setStroke(new BasicStroke(10)); 
		g2D.setColor(tan);
		g2D.setBackground(Color.white);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		
		Shape head = new Ellipse2D.Double(150, 40, 100, 100);  
		
			
		if( step == 0 ) { 
			//g2D.fill(head);
			//g2D.drawLine(50, 150, 50, 200);    // confused on how to draw two things at once 
			step = 1;
		}
		else if( step == 1) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME   starting postion 
			g2D.drawLine(200, 200, 250, 200);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 200);    // LEFT ARM
			g2D.drawLine(200, 250, 240, 285); 						// RIGHT LEG
			g2D.drawLine(200, 250, 160, 285);							// LEFT LEG
			step =2;															// lines (x,y,x,y)   draws a line between the two points
		}
		else if( step == 2) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 175);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 175);    // LEFT ARM
			g2D.drawLine(200, 250, 210, 285); 	// RIGHT LEG
			g2D.drawLine(200, 250, 190, 285);	// LEFT LEG
			step =3;
		}
		else if( step == 3) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 200);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 200);    // LEFT ARM
			g2D.drawLine(200, 250, 240, 285); 	// RIGHT LEG
			g2D.drawLine(200, 250, 160, 285);	// LEFT LEG
			step =4;													// Cirlces (x,y,width,height) 
		}
		else if( step == 4) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 175);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 175);    // LEFT ARM
			g2D.drawLine(200, 250, 210, 285); 	// RIGHT LEG
			g2D.drawLine(200, 250, 190, 285);	// LEFT LEG
			step =5;
		}
		else if( step == 5) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 200);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 200);    // LEFT ARM
			g2D.drawLine(200, 250, 240, 285); 	// RIGHT LEG  
			g2D.drawLine(200, 250, 160, 285);	// LEFT LEG
			step =6;
		}
		else if( step == 6) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 175);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 175);    // LEFT ARM
			g2D.drawLine(200, 250, 210, 285); 	// RIGHT LEG
			g2D.drawLine(200, 250, 190, 285);	// LEFT LEG
			step =7;
		}
		else if( step == 7) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 200);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 200);    // LEFT ARM
			g2D.drawLine(200, 250, 240, 285); 	// RIGHT LEG  
			g2D.drawLine(200, 250, 160, 285);	// LEFT LEG
			step =8;
		}
		else if( step == 8) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 175);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 175);    // LEFT ARM
			g2D.drawLine(200, 250, 210, 285); 	// RIGHT LEG
			g2D.drawLine(200, 250, 190, 285);	// LEFT LEG
			step =9;
		}
		else if( step == 9) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 200);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 200);    // LEFT ARM
			g2D.drawLine(200, 250, 240, 285); 	// RIGHT LEG  
			g2D.drawLine(200, 250, 160, 285);	// LEFT LEG
			step =10;
		}
		else if( step == 10) {  
			g2D.fill(head);  
			g2D.drawLine(200, 50, 200, 250); // BODY STAYS SAME
			g2D.drawLine(200, 200, 250, 175);   // RIGHT ARM
			g2D.drawLine(200, 200, 150, 175);    // LEFT ARM
			g2D.drawLine(200, 250, 210, 285); 	// RIGHT LEG
			g2D.drawLine(200, 250, 190, 285);	// LEFT LEG
			step =11;
		}
	}
	
}
