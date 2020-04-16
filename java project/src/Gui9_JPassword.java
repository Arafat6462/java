import javax.swing.JFrame;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class Gui9_JPassword extends JFrame {
	
	
	private Container c;
	private JPasswordField pf;
	private Font f;
	
	Gui9_JPassword()
	{
		setvalur();
	}
	
	
	
	void setvalur()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		
		f=new Font("arial",Font.BOLD,28);
		
		pf=new JPasswordField();
		pf.setEchoChar('+'); // hide with this letter
		pf.setBounds(50,50,150,50);
		pf.setFont(f);
		pf.setForeground(Color.green);
		pf.setBackground(Color.GRAY);
		c.add(pf);
	}

	public static void main(String[] args) {
 
		
		
		
		Gui9_JPassword frame=new Gui9_JPassword();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 500, 800, 650);
		frame.setTitle("this is a password Demo");
	}

}
