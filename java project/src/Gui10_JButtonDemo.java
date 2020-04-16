import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Cursor;

public class Gui10_JButtonDemo extends JFrame {
	
	private Container c;
	private JButton button1,button2;
	private Font f;
	private Cursor cursor;
	private ImageIcon img1,img2;
	
	Gui10_JButtonDemo()
	{
		setvalue();
		
	}	
	
	public void setvalue()
	{
		
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		
		f=new Font("arial", Font.BOLD,38);
		
		cursor=new Cursor(Cursor.CROSSHAIR_CURSOR);// mouse pointer view
		
		img1=new ImageIcon(getClass().getResource("c.png"));
	 

		
		
		button1=new JButton("submit");
		button1.setBounds(50,50,200,50);
		button1.setFont(f);
		button1.setForeground(Color.blue);
		button1.setBackground(Color.GRAY);
		button1.setCursor(cursor);
		c.add(button1);
		
		
		button2=new JButton(img1); // import image in button
		button2.setBounds(300,50,200,50);
		button2.setFont(f);
		button2.setForeground(Color.yellow);
		button2.setBackground(Color.GRAY);
		c.add(button2);
		
	}
	 
		
		

	public static void main(String[] args) {
 
		

		Gui10_JButtonDemo frame=new Gui10_JButtonDemo();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 500, 800, 650);
		frame.setTitle("this is a password Demo");
	}
	}


