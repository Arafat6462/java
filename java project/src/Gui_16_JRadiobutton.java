import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Gui_16_JRadiobutton extends JFrame {
	
	private Container container;
	private JRadioButton maleButton, femaleButton;
	private Font font;
	private ButtonGroup buttonGroup; // for select only one in button
	private JTextArea textArea;
	
	
	Gui_16_JRadiobutton()
	{
		addvalue();
	}
	
	public void addvalue()
	{
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(300,100,450,500);
		 setTitle("Radio button demo");
		 
		 
		 container=this.getContentPane();
		 container.setLayout(null);
		 container.setBackground(Color.GRAY);
		 
		 
		 font=new Font("arafat",Font.BOLD,18);
		 
		 buttonGroup=new ButtonGroup();
		 
		 
		 maleButton=new JRadioButton("male");
		 maleButton.setBounds(50,50,100,50);
		 maleButton.setFont(font);
		 maleButton.setBackground(Color.gray);	
		 maleButton.setForeground(Color.white); 
		 maleButton.setSelected(true); // by default select male button
		 container.add(maleButton); 
		 
		 
		 femaleButton=new JRadioButton("female");
		 femaleButton.setBounds(200,50,100,50);
		 femaleButton.setFont(font);
		 femaleButton.setBackground(Color.darkGray);
		 femaleButton.setForeground(Color.white);
	   //femaleButton.setEnabled(false); // to disable the button
		 container.add(femaleButton);
		 
		 
		 buttonGroup.add(maleButton); // add after adding container 
		 buttonGroup.add(femaleButton);
		 
		 
		 textArea=new JTextArea();
		 textArea.setBounds(50,180,350,200);
		 textArea.setFont(font);
		 textArea.setBackground(Color.DARK_GRAY);
		 textArea.setForeground(Color.white);
		 container.add(textArea);
		 
		 
		 
		 Handler handler=new Handler();
		 maleButton.addActionListener(handler);
		 femaleButton.addActionListener(handler);
		 
		 
	}

	
	    
	public class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) { // here 'e' receive object handler for male,female.....etc
			// TODO Auto-generated method stub
			
			if(e.getSource()==maleButton)
			{
				//textArea.setText("you have selected male button: \n");// here .setText method write multiple message in same space
			    textArea.append("you have selected male button: \n");
				
			}
			if(femaleButton.isSelected()) // isSelected
			{
			    textArea.append("you have selected female button: \n");
			  //  textArea.setText("you have selected female button: \n");

				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
 
		
		
		
		Gui_16_JRadiobutton frame=new Gui_16_JRadiobutton();
		frame.setVisible(true);
		
	}

}
