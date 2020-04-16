import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Gui_11_ActionListenerJButton extends JFrame {
	
	private Container c;
	private JTextField tf;
	private JButton bt;
	
	
	Gui_11_ActionListenerJButton()
	{
		setvalur();
	}

	public void setvalur()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		
		tf=new JTextField();
		tf.setBounds(50,50,250,50);
		c.add(tf);
		
		
		bt=new JButton("clear");
		bt.setBounds(80,150,100,50);
		c.add(bt);
		
		
		bt.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(""); // that will set "" in textfield
			}
			
		});
		
		
		
	}
	public static void main(String[] args) {
 
		
		
		Gui_11_ActionListenerJButton frame=new Gui_11_ActionListenerJButton();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 500, 800, 650);
		frame.setTitle("this is a jbutton action listener Demo");
	}

}
