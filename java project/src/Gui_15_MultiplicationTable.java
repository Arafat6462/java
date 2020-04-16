import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui_15_MultiplicationTable extends JFrame {
	
	
	private Container container;
	private JLabel imgJLabel , texJLabel;
	private TextArea textArea;
	private JTextField textField;
	private JButton clearButton;
	private ImageIcon imgIcon;
	private Font font;
	private Cursor cursor;
	
	
	Gui_15_MultiplicationTable()
	{
		addfunction();
	}
	
	public void addfunction()
	{
		container=this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		
		
		imgIcon=new ImageIcon(getClass().getResource("c.png"));		
		imgJLabel=new JLabel(imgIcon);
		imgJLabel.setBounds(20,10,imgIcon.getIconWidth(),imgIcon.getIconHeight());
		container.add(imgJLabel);
		
		
		font=new Font("arafat",Font.BOLD,22);
		cursor=new Cursor(Cursor.HAND_CURSOR);
		
		texJLabel=new JLabel("enter any number :");
		texJLabel.setBounds(20,150,250,50);
		texJLabel.setOpaque(true);
		texJLabel.setForeground(Color.DARK_GRAY);
		texJLabel.setBackground(Color.gray);
		texJLabel.setFont(font);
		container.add(texJLabel);
		
		
		textField=new JTextField();
		textField.setBounds(300,150,100,50);
		textField.setFont(font);
		textField.setBackground(Color.gray);
		textField.setHorizontalAlignment(JTextField.CENTER);
		container.add(textField);
		
		
		clearButton=new JButton("clear");
		clearButton.setBounds(300,220,100,50);
		clearButton.setBackground(Color.gray);
		clearButton.setForeground(Color.white);
		clearButton.setFont(font);
		clearButton.setCursor(cursor);
		container.add(clearButton);
		
		
		textArea=new TextArea();
		textArea.setBounds(20,300,400,400);
		textArea.setBackground(Color.gray);
		textArea.setFont(font);
		container.add(textArea);
		
		
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String valueString=textField.getText();
				if(valueString.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "you did't put any number ");
				}
				else
				{
					
				textArea.setText(""); //at first text area will be empty otherwise previous thing also print every time 
 
				int number=Integer.parseInt(textField.getText()); // ParseInt convert String to integer
				
				for(int i=1; i<=10; i++)
				{
					int result=number*i;
					
					// convert int to String because text area only care about String
					String resultString=String.valueOf(result);						
					String numbertString=String.valueOf(number);
			    	String iString=String.valueOf(i);
			    	
			    	//print
			    	textArea.append(numbertString+" X "+iString+" = "+resultString+"\n");

					
				}
			}
			}
		});
		
		
		clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
 
				textArea.setText("");
			}
		});
		
		
				
	}

	public static void main(String[] args) {
		
		Gui_15_MultiplicationTable frame=new Gui_15_MultiplicationTable();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500,20,450,800);
		frame.setTitle("multiplication table");
 
	}

}
