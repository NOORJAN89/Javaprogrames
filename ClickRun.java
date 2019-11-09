import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ClickRun {
	static JButton b1, b2; 
	   static JFrame j; 
	  
	   public	    static JLabel l, l1; 
	public long StartTimer=0;
	public long StopTimer=0;
	public long ElspedTimer=0;

	
public void start() {
	StartTimer=System.currentTimeMillis();
	
	System.out.println("Start Time in seconds is="+StartTimer/1000 );
}

public void stop () {
	StopTimer=System.currentTimeMillis();
	System.out.println("Stop Time in seconds is="+StopTimer/1000 );
}

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
	static class Action extends Stopwatch implements ActionListener  {
		Stopwatch sw=new Stopwatch();

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==b1) {
			
			 l.setText(" timer is running"); 
			 sw.start();
	    }
			else {
				 l1.setText(" timer is stopped"); 
				 sw.stop();
				 
			}
	
		}
		

		}
	
}
