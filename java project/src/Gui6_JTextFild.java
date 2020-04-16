import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
 
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Gui6_JTextFild extends JFrame {				
	
	
	private Container c;
	private JTextField tf1,tf2;		
	private Font f;
	
	Gui6_JTextFild()
	{
		  setFunction();
	}
	
	public void setFunction()
	{
		
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		
		f=new Font("arafat",Font.ITALIC+Font.BOLD,18 );
		
		
		tf1=new JTextField("username ");
		tf1.setBounds(50,50,250,50);
		tf1.setFont(f);
		tf1.setForeground(Color.yellow); // text color
		tf1.setBackground(Color.black); // text background color
		tf1.setHorizontalAlignment(JTextField.RIGHT); // text alignment
		c.add(tf1);
		
		
		tf2=new JTextField();
		tf2.setBounds(350,50,250,50);
		tf2.setText("password");
		tf2.setFont(f);
		c.add(tf2);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Gui6_JTextFild frame=new Gui6_JTextFild();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 100, 800, 650);
		frame.setTitle("this is a JTextField Demo");
		
		
 
	}

}
