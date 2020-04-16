
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 
public class Gui8_ActionListener extends JFrame
{
	
	private Container c;
	private JTextField tf1,tf2;
	
	Gui8_ActionListener()
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
		
		
		Handle handle = new Handle();
		tf1.addActionListener(handle);		
		tf2.addActionListener(handle);

		
		 
	}
	
	
	class Handle implements ActionListener
	{

//		// action list for tf1 work when press enter			
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==tf1)
				{
					
					String s=tf1.getText();
					if(s.isEmpty())
					{
						JOptionPane.showMessageDialog(null,"please enter anything");

					}
					else
					JOptionPane.showMessageDialog(null,"tf1 is aaa: "+s);
					
				}
				else
				{
					String s=tf2.getText();
					if(s.isEmpty())
					{
						JOptionPane.showMessageDialog(null,"please enter anything");

					}
					else
					JOptionPane.showMessageDialog(null,"tf2 is aaa: "+s);
				}
				
 
			}
 
	}
	
	
	public static void main(String[] args) {
 
		
		
		
		
		Gui8_ActionListener frame=new Gui8_ActionListener();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 500, 800, 650);
		frame.setTitle("this is a ActionListener Demo");
		
	}

}
