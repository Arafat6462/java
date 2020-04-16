import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui_13_new_LoginFrame extends JFrame {
	
	
	private Container c;
	private JLabel label;
	
	
	
	Gui_13_new_LoginFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(250,250,800,500);
		setTitle("new frame");
		
		
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		
		label=new JLabel("hello !!  welcone to new frame");
		label.setBounds(50,50,400,50);
		
		label.setForeground(Color.GRAY);
		//label.setOpaque(true);
		label.setBackground(Color.blue);

		c.add(label);
		
 	}

	public static void main(String[] args) {
		
		
		Gui_13_new_LoginFrame fr=new Gui_13_new_LoginFrame();
		fr.setVisible(true);
 
	}

}
