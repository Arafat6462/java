import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui7_ActionLister extends JFrame
{
	
	private Container c;
	private JTextField tf1,tf2;
	
	Gui7_ActionLister()
	{
		  AddFunction();
	}

	
	
	public void AddFunction()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		
		tf1=new JTextField();
		tf1.setBounds(50,50,250,50);
		c.add(tf1);
		
		
		

		tf2=new JTextField();
		tf2.setBounds(50,150,250,50);
		c.add(tf2);
		
		
		
		// action list for tf1 work when press enter
		tf1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				String s=tf1.getText();
				if(s.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"please enter anything");

				}
				else
				JOptionPane.showMessageDialog(null,"tf1 is : "+s);
 
			}
			
		});
		
		
		// action list for tf2 work when press enter
				tf2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e)
					{
						String s=tf2.getText();
						if(s.isEmpty())
						{
							JOptionPane.showMessageDialog(null,"please enter anything");

						}
						else
						JOptionPane.showMessageDialog(null,"tf2 is : "+s);
		 
					}
					
				});
	}
	
	
	
	
	
	public static void main(String[] args) {
 
		
		
		
		
		Gui7_ActionLister frame=new Gui7_ActionLister();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 500, 800, 650);
		frame.setTitle("this is a ActionListener Demo");
		
	}

}
