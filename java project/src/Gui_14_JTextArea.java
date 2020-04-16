import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Gui_14_JTextArea extends JFrame {
	
	private Container c;
	private JTextArea ta; // "JTextArea" for display multiple line text 
	                     // "JTextField" for display single line text
	private Font font;
	private JScrollPane scrollPane;
	
	Gui_14_JTextArea()
	{
		addfunction();
	}
	
	
	
	public void addfunction()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.gray);
		
		
		font=new Font("arial",Font.BOLD,18);
		
		
		ta=new JTextArea("this is a JTextArea");
		//ta.setBounds(50,50,200,200);
		ta.setFont(font);
		ta.setForeground(Color.DARK_GRAY);
		ta.setBackground(Color.WHITE);
		
	    ta.setLineWrap(true); // when the space of text area will end, then auto select next line
		ta.setWrapStyleWord(true);  //wraping word by word
//	    c.add(ta);
	    
	    
	    scrollPane=new JScrollPane(ta); //add text area with Jscrollpane. not Jscrollpane with text area :)
	 // scrollPane=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR);
	    scrollPane.setBounds(50,50,200,200);
	    c.add(scrollPane);

	}

	public static void main(String[] args) {
 
		Gui_14_JTextArea frame=new Gui_14_JTextArea();
		frame.setVisible(true);
		frame.setBounds(50,50,800,500);
		frame.setTitle("text area demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
