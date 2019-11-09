import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MouseClick{   
	
	  static JButton b1, b2; 
	  
	    static JFrame j; 
	  

	    static JLabel l, l1; 
	 public static void main(String[] args) {    

		 JFrame  j= new JFrame() ;
JPanel p= new JPanel();

j.setVisible(true);
j.setSize(300, 300);
b1= new JButton("start");
 b2= new JButton("stop");
 l = new JLabel(); 
 l1= new JLabel();
p.add(l);
p.add(b1);
j.add(p);
p.add(l1);
p.add(b2);
b1.addActionListener(new Action());	
b2.addActionListener(new Action());
	 }
	 
static class Action implements ActionListener  {
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
		
		 l.setText(" timer is running"); 
    }
		else {
			 l1.setText(" timer is stopped"); 

		}
	}
	
	
	}


}
  
	
	

	  
		
		
	


