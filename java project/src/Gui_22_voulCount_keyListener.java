import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Gui_22_voulCount_keyListener extends JFrame {
	private Container container;
	private JLabel promptJLabel,voweLabel,aJLabel,eJLabel,iJLabel,oJLabel,uJLabel;
	private JTextArea textArea;
	private Font font;
	private JScrollPane scrollPane;
	
	
	Gui_22_voulCount_keyListener()
	{
		addfunction();
		
	}
	
	public void addfunction()
	{
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setBounds(400,200,900,700);
		this.setTitle("voul count");
		
		font =new Font("arafat",Font.BOLD,20);
		
		
		container=this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.gray);
		
		
		promptJLabel=new JLabel("enter the text : ");
		promptJLabel.setBounds(25,25,200,25);
		promptJLabel.setFont(font);
		//container.add(promptJLabel);
		
		
		textArea=new JTextArea();
		textArea.setFont(font);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
//		textArea.setBounds(250,25,600,100);
//		container.add(textArea);

		
		
		scrollPane=new JScrollPane(textArea);
		scrollPane.setBounds(250,25,600,100);
		scrollPane.setBackground(Color.black);
		container.add(scrollPane);

		
		

	}

	public static void main(String[] args) {
 
		
		Gui_22_voulCount_keyListener frame =new Gui_22_voulCount_keyListener();
	}

}
