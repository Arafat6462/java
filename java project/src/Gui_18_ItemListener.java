import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

 
public class Gui_18_ItemListener extends JFrame{
	
	
	private Container container;
	private JCheckBox javacheckBox, cCheckBox, pythonCheckBox;
	private ButtonGroup buttonGroup; // for select only one item from multiple choice
	private Font font;
	private JLabel label;
	
	
	Gui_18_ItemListener()
	{
		additem();
	}
	
	public void additem()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(350,150,600,800);
		this.setTitle("Checkbox demo");
		
		
		container=this.getContentPane();
		container.setBackground(Color.pink);
		container.setLayout(null);
		
		font=new Font("arafat",Font.ITALIC+Font.BOLD,18);
		
		buttonGroup=new ButtonGroup();
		
		
		javacheckBox=new JCheckBox("Java");
		javacheckBox.setBounds(50,50,100,30);
		javacheckBox.setBackground(Color.gray);
		javacheckBox.setFont(font);
		container.add(javacheckBox);
		
		
		cCheckBox=new JCheckBox("C");
		cCheckBox.setBounds(50,90,100,30);
		cCheckBox.setBackground(Color.gray);
		cCheckBox.setFont(font);
		//cCheckBox.setEnabled(false); // disable option
		container.add(cCheckBox);
		
		
		pythonCheckBox=new JCheckBox("Python",true); // this true work for set default selected as, .setSelected
		pythonCheckBox.setBounds(50,130,100,30);
		pythonCheckBox.setBackground(Color.gray);
		pythonCheckBox.setFont(font);
		//pythonCheckBox.setSelected(true);  // default selected
		container.add(pythonCheckBox);
		
		
		buttonGroup.add(javacheckBox);
		buttonGroup.add(cCheckBox);
		buttonGroup.add(pythonCheckBox);
		
		label=new JLabel();
		label.setBounds(50,200,300,30);
		label.setFont(font);
		container.add(label);
		
		
		Handler handler=new Handler();
		javacheckBox.addItemListener(handler);
		cCheckBox.addItemListener(handler);
		pythonCheckBox.addItemListener(handler);


	}
	
	class Handler implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
 
			if(e.getSource()==javacheckBox)
			{
				label.setText("you hava selected java");
			}
			
			else if(cCheckBox.isSelected())
			{
				label.setText("you hava selected c");
			}
			
			else 
			{
				label.setText("you hava selected Python");
			}
		}
		
	}
	 
	
	
	
	public static void main(String[ ] args)
	{
		
		Gui_18_ItemListener frame=new Gui_18_ItemListener();
		frame.setVisible(true);
		
	}

}

