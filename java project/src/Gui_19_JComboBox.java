import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui_19_JComboBox extends JFrame {
	
	
	private Container container;
	private JComboBox comboBox; // to choose one from multiple choice
	private String[] programingLanguage= {"c","c++","java","python","algorithm","data structure","math-3",
			                            "physics","english","data base","coa","bus-com","ooad","math-4"};
	private Font font;
	private JLabel label;
	private JButton button;
	
	Gui_19_JComboBox()
	{
		addvalue();
	}
	
	public void addvalue()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("Combo box demo");
		
		
		container=this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		
		font=new Font("arafat",Font.BOLD,22);
		
		
		comboBox=new JComboBox(programingLanguage);
		comboBox.setBounds(50,50,250,50);
		comboBox.setFont(font);
		comboBox.setEditable(true); //to edit combo box		
    //  comboBox.setSelectedIndex(4); //show default value by index
		comboBox.setSelectedItem("java"); //show default value by item		
		comboBox.addItem("add value");// add new item
		comboBox.removeItem("add value"); // delete item
	//	comboBox.removeItemAt(4); // delete item
   //	comboBox.removeAllItems(); // remove all item		
		container.add(comboBox);		
	  //System.out.println("total item count "+comboBox.getItemCount());
		
		
		button=new JButton("show");
		button.setBounds(320,50,100,50);
		container.add(button);
		
		
		label=new JLabel();
		label.setBounds(50,400,400,60);
		label.setOpaque(true);
		label.setBackground(Color.pink);
		//label.setFont(font);
		container.add(label);
		
		
	//	comboBox.addActionListener(new ActionListener()	
		button.addActionListener(new ActionListener()

		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				String string=comboBox.getSelectedItem().toString();
				label.setText(" you selected : "+string);
			}
		});
		
	}
	
	
	

	public static void main(String[] args)
	{
 
		Gui_19_JComboBox frameBox=new Gui_19_JComboBox();
		frameBox.setVisible(true);
		
	}

}
