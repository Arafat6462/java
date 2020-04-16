import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui_12_LoginFrame extends JFrame{
	
	
	private Container c;
	private JLabel userlable,passlable;
	private JTextField tf;
	private JPasswordField pf;
	private JButton submitbutton, cleanbutton;
	private Font f;
	
	
	Gui_12_LoginFrame()
	{
	   	 this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setBounds(300,200,800,500);         // no need to add frame.
		 setTitle("Login Frame");
		 
			c=this.getContentPane();
			c.setLayout(null);
			c.setBackground(Color.GRAY);
			
			
			f=new Font("arial",Font.BOLD,22);
		
			
			userlable=new JLabel("user name : ");
			userlable.setBounds(50,50,200,50);
			userlable.setFont(f);
			c.add(userlable);
			
			
			passlable=new JLabel("password : ");
			passlable.setBounds(50,150,200,50);
			passlable.setFont(f);
			c.add(passlable);
			
			
			tf=new JTextField();
			tf.setBounds(250,50,280,50);
			tf.setFont(f);
			c.add(tf);
			
			
			pf=new JPasswordField();
			pf.setBounds(250,150,280,50);
			pf.setFont(f);
			pf.setEchoChar('*');
			c.add(pf);
		 
			
			submitbutton=new JButton("login");
			submitbutton.setBounds(250,220,120,50);
			submitbutton.setFont(f);
			c.add(submitbutton);
			
			cleanbutton=new JButton("clear");
			cleanbutton.setBounds(380,220,120,50);
			cleanbutton.setFont(f);
			c.add(cleanbutton);
			
			
			
			cleanbutton.addActionListener(new ActionListener() 
			{

				@Override
				public void actionPerformed(ActionEvent arg0) {
					tf.setText("");
					pf.setText("");
 

				}
				
			});
			
			// login
			submitbutton.addActionListener(new ActionListener() 
			{

				@Override
				public void actionPerformed(ActionEvent arg0) {
 
					String username=tf.getText();
					String password=pf.getText();
					
					if(username.toLowerCase().equals("arafat") && password.equals("123"))
					{
						JOptionPane.showMessageDialog(null, "you are successfully logined :");
 						
						
						
						//login into new frame
						Gui_13_new_LoginFrame frame=new Gui_13_new_LoginFrame();
						frame.setVisible(true); // it will open new frame
						dispose(); //hide the previous frame
					 
					}						

					else
						JOptionPane.showMessageDialog(null, "invalid username or password");
					


				}
				
			});
		 
		 
 	}
 

	public static void main(String[] args) {
 
		
		
		Gui_12_LoginFrame frame=new Gui_12_LoginFrame();
		
		frame.setVisible(true);
		
	}

}
