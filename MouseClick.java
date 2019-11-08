import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MouseClick{    
	static JPanel p;
	static JFrame j;
public static void main(String[] args) {    
 j=new JFrame();
j.setVisible(true);
j.setSize(300, 300);
p = new JPanel(); 
JButton b1= new JButton("start");	
//JButton b2= new JButton("stop");	

//JLabel l = new JLabel("nothing selected"); 
j.add(p);
p.add(b1);
//p.add(b2);

j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1.addActionListener(new Action()); 
//b2.addActionListener(new Action()); 

} 


static class Action   implements ActionListener  {
	public void actionPerformed(ActionEvent e) {
		JFrame j2=new JFrame();
		j2.setVisible(true);
		j2.setSize(200, 200);
		JLabel l = new JLabel(); 
		JLabel l2 = new JLabel(); 
		JPanel p2 = new JPanel(); 
		JButton b2= new JButton("stop");
        l.setText(e.getActionCommand() + " selected."); 
        l2.setText(e.getActionCommand() + " selected."); 

j2.add(p2);
p2.add(l);
p2.add(b2);
j.add(p);
p.add(l2);


	}
}
  
	
}
	

	  
		
		
	


