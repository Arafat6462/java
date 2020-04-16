import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui_21_KeyListener extends JFrame{
	
	private Container container;
	private JTextArea textArea;
	private JTextField textField;
	private Font font;
	
	Gui_21_KeyListener()
	{
		addvalue( );
	}
	
	public void addvalue()
	{
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(50,50,800,700);
		setTitle("key listener");
		
		 
		
		container=this.getContentPane();
		container.setLayout(null);
		//container.setBackground(Color.DARK_GRAY);
		
		 
		font=new Font("arafat",Font.BOLD,20);
		
		
		textField =new JTextField();
		textField.setBounds(50,50,200,50);
		container.add(textField);
		
		textArea =new JTextArea();
		textArea.setBounds(50,150,200,450);
		textArea.setBackground(Color.green);
		container.add(textArea);
		
		
		
		
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				textArea.append("key typed : "+e.getKeyChar()+"\n");
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				textArea.append("key relessed : "+e.getKeyChar()+"\n");

			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				textArea.append("key pressed : "+e.getKeyChar()+"\n");

			}
		});
	}

	public static void main(String[] args) {
		
		
 
		Gui_21_KeyListener frame=new Gui_21_KeyListener();
	}

}