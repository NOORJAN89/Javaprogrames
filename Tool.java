import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class Tool extends JFrame implements ActionListener, ItemListener { 
	  
	    // buttons 
	    static JButton b1, b2; 
	  
	    // create a frame 
	    static JFrame f; 
	  
	  
	    // create a label 
	    static JLabel l, l1; 
	  
	    public static void main() 
	    { 
	        // create a object of class 
	        Tool to = new Tool(); 
	  
	        // create a label 
	        l = new JLabel("nothing selected"); 
	        l1 = new JLabel("nothing selected"); 
	  
	        // create a frame 
	        f = new JFrame("Toolbar demo"); 
	  
	        // set layout for frame 
	        f.setLayout(new BorderLayout()); 
	 
	     
	  
	        // create a panel 
	        JPanel p = new JPanel(); 
	  
	    
	    
	
	        // create new buttons 
	        b1 = new JButton("button 1"); 
	        b2 = new JButton("button 2"); 
	  
	        // add ActionListener to it 
	        b1.addActionListener(to); 
	        b2.addActionListener(to); 
	  
	        // add buttons 
	        p.add(b1); 
	        p.add(b2); 
	  

	   
	  
	        // create a panel 
	        JPanel p1 = new JPanel(); 
	  
	        p1.add(l); 
	        p1.add(l1); 
	  
	   
	        f.add(p1, BorderLayout.CENTER); 
	  
	        // set the size of the frame 
	        f.setSize(500, 500); 
	        f.setVisible(true); 
	    } 
	  
	    // if button is pressed 
	    public void actionPerformed(ActionEvent e) 
	    { 
	        l.setText(e.getActionCommand() + " selected."); 
	    } 
	  
	    // if combo box is selected 
	    public void itemStateChanged(ItemEvent e) 
	    { 
	        l1.setText( " selected."); 
	    } 
	}

