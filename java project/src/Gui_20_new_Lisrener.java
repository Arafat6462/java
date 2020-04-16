import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui_20_new_Lisrener extends JFrame implements ActionListener {
	
	private Container container;
	private JButton redButton, greenButton, blurButton;
	private Font font;
	
	
	Gui_20_new_Lisrener()
	{
		addvalue();
	}
	
	public void addvalue()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(50,50,800,500);
		setTitle("listener demo");
		
		
		container=this.getContentPane();
		container.setBackground(Color.DARK_GRAY);
		container.setLayout(null);
		
		
		font=new Font("arafat",Font.BOLD,22);
		
		
		redButton=new JButton("red button");
		redButton.setBounds(50,50,200,50);
		redButton.setBackground(Color.red);
		redButton.setFont(font);
		redButton.setForeground(Color.white);
		container.add(redButton);
		
		
		greenButton=new JButton("green button");
		greenButton.setBounds(50,150,200,50);
		greenButton.setBackground(Color.green);
		greenButton.setFont(font);
        greenButton.setForeground(Color.white);
		container.add(greenButton);
		
		
		blurButton=new JButton("blue button");
		blurButton.setBounds(50,250,200,50);
		blurButton.setBackground(Color.blue);
		blurButton.setFont(font);
        blurButton.setForeground(Color.white);
		container.add(blurButton);
		
		
		
		redButton.addActionListener(this);
		blurButton.addActionListener(this);
		greenButton.addActionListener(this);

	
		
	///////////////   old action listener method   //////////////
		
		
		
//		redButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				container.setBackground(Color.red);
//				
//			}
//		});
//		
//       greenButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				container.setBackground(Color.green);
//				
//			}
//		});
//
//
//       blurButton.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//		container.setBackground(Color.blue);
//		
//	}
//});
		
	
	}
	
	
	
	
	/////////////////////            new Action listener method             ////////////////
	
	// #1 implement the Listener interface
   //  #2 override all of its method
  //   #3 add the listener with the component	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
 
		if(e.getSource()==redButton)
		{
			container.setBackground(Color.red);
		}

		else if(e.getSource()==blurButton)
		{
			container.setBackground(Color.blue);
		}

		else if(e.getSource()==greenButton)
		{
			container.setBackground(Color.green);
		}
	}
	
	
	

	public static void main(String[] args) 
	{
 
		Gui_20_new_Lisrener frame= new Gui_20_new_Lisrener();
	}

	
}
