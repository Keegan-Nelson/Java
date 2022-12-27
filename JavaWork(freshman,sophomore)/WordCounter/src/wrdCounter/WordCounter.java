package wrdCounter;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.*; 

public class WordCounter extends JFrame {
		// ActionListener for the only button in the program
	
	private JButton doItButton; 
	private JTextArea textIn; 
	private JTextArea countOut; 
	private HashMap theMap; 
	
	
	
	
	public WordCounter(String title) { 
		this(); 
		setTitle(title); 
	}
	
		private class doButton implements ActionListener {
			public void actionPerformed(ActionEvent e){
				countWords();
				repaint();
			}
		}
			

			
		
			
			
			public static void main(java.lang.String[] args) {

				WordCounter frame = new WordCounter("Count-O-Matic");
				frame.setSize(500,500);
				frame.setVisible(true);
			}
			
			public WordCounter() {
				super();
				
				//Use a HashMap for counting words
				theMap = new HashMap();

				Container ctPane = getContentPane();
				
				//Set up a button at the bottom of the panel 
				// to run word counting
				JPanel buttonPanel = new JPanel();
				doItButton = new JButton("Do It");
				doItButton.addActionListener(new doButton());
				buttonPanel.add( doItButton );
				ctPane.add(buttonPanel, "South");
				
				
				//A JPanel to arrange the text areas
				JPanel textPanel = new JPanel();
				textPanel.setLayout(new GridLayout(2,1));
				ctPane.add( textPanel, "Center");
				
				//text area for inputting text
				textIn = new JTextArea(12,32);
				textIn.setLineWrap(true);
				JScrollPane theScroller = new JScrollPane(textIn);
				textPanel.add(theScroller );

				//text area for outputting the results of the word count
				countOut = new JTextArea();
				countOut.setLineWrap(true);
				countOut.setEditable(false);
				theScroller = new JScrollPane(countOut);
				textPanel.add(theScroller);
			}
				
			public void countWords() { 
				// Go through each word in the input text
				//First we tokenize all the text in the text area and use a while loop to
					//grab each word.
				StringTokenizer st = new StringTokenizer(textIn.getText());
				while(st.hasMoreTokens()){
					String word = st.nextToken();
					// See if the word is in theMap
					//We then see if the word has been added to the Map as a key.
					Object obj = theMap.get(word);
					//Add it to theMap if it's not in theMap
					//If the word hasn't been added (the object returned by the Map is
					//null), add it paired with the Integer 1 to indicate that one 
					//instance of the word has been found so far.
					if( obj == null ){
						theMap.put(word, new Integer(1)); 
					}
					//Update the count if it is already in theMap
					//If the word is in the Map we get the int value from the old Integer
						//wrapper add 1 to it, wrap it in a new wrapper a, and put the word 
						//Integer pair back in the Map
					else{
						Integer count = (Integer) obj;
						theMap.put(word, count.intValue()+1 );
					}
				}
				//Get the list of words from theMap
				//After we've gone through all the text we create an array of all the keys
					//for the Map.  This is a list of all the words in the text. Any word only 
					//appears once in this list.
				ArrayList words = new ArrayList(theMap.keySet());
				//sort the list
				//Then we sort the words.
				Collections.sort(words);
				
				//Go through each word in the list 
				// and pull up the word count
				String output = "\n";
				//Finally we use the words in the list to go through the Map and retrieve 
					//the count for each word.  
				Iterator iterator = words.iterator();
				while( iterator.hasNext() ){
					Object word = iterator.next();
					//We display each word and its count on a separate line and output 
						//the resulting text to the countOut TextArea.
					output = output + word +":"+ theMap.get(word)+"\n";
				}
				//Display the resulting output in countOut
				countOut.setText(output);
			}
				
}
