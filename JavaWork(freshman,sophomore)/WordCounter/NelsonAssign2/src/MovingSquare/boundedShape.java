package MovingSquare;


	import java.awt.*;
	import java.awt.event.*;                         
	import javax.swing.*;  

	public class boundedShape extends JFrame implements KeyListener {

		private static final int displayWidth = 600;
		private static final int displayHeight = 500;
		
		private static final int startX = 100;
		private static final int startY = 100;
		private static final int moveIncrements = 10;


		private static int x = startX;   
		private static int y = startY;           
		

		
		public static void main (String[] args) {
		
		    boundedShape t = new boundedShape();
		    t.setSize(displayWidth, displayHeight);
		    t.setVisible(true);

		    t.addKeyListener(t);                       
		  
		}

		public void keyPressed(KeyEvent e)                 
		{
		    int keyCode = e.getKeyCode();
		    if (keyCode == KeyEvent.VK_LEFT)
		    {
		        x = x - moveIncrements;
		    }
		    else if (keyCode == KeyEvent.VK_RIGHT)
		    {
		        x = x + moveIncrements;
		    }
		    else if (keyCode == KeyEvent.VK_UP)
		    {
		        y = y - moveIncrements;
		    }
		    else if (keyCode == KeyEvent.VK_DOWN)
		    {
		        y = y + moveIncrements;
		    }
		    x = Math.max(0, x);
		    x = Math.min(545, x);
		    y = Math.max(30, y);
		    y = Math.min(445, y);
		    
		    repaint();
		}

		
		public void keyTyped(KeyEvent e)                   
		{
		}

		
		public void keyReleased(KeyEvent e)               
		{
		}

		   public void paint(Graphics g)
		    {
		        g.setColor(Color.black);
		        g.fillRect(0, 0, displayWidth, displayHeight);

		        g.setColor(Color.GREEN);
		        g.fillRect(x, y, 50, 50);
		    
		    }
		   
		  
}


