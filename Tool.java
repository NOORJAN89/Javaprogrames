
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class Tool extends JFrame { 
  
    static JButton b1, b2; 
  
    static JFrame f; 
 
  static JLabel l, l1; 
  static JComboBox x;
  
    public static void main(String[] args) 
    { 
    
    	  f = new JFrame(); 
    	  
          // set layout for frame 
          f.setLayout(new BorderLayout()); 
    
          // create a toolbar 
          JToolBar tb = new JToolBar(); 
    
          // create a panel 
          JPanel p = new JPanel(); 
    
       
       x = new JComboBox(new String[] { "item 1", "item 2", "item 3" }); 
    
          // create new buttons 
          b1 = new JButton("button 1"); 
          b2 = new JButton("button 2"); 
    
          // add buttons 
          p.add(b1); 
          p.add(b2); 
    
          // add menu to menu bar 
          p.add(x); 
    
          tb.add(p); 
    
          // add toolbar to frame 
          f.add(tb, BorderLayout.NORTH); 
    
          // set the size of the frame 
          f.setSize(500, 500); 
          f.setVisible(true); 
  
   
} 
    
    public void actionPerformed(ActionEvent e) 
    { 
        l.setText(e.getActionCommand() + " selected."); 
    } 
  
    // if combo box is selected 
    public void itemStateChanged(ItemEvent e) 
    { 
        l1.setText(x.getSelectedItem() + " selected."); 
    } 
}