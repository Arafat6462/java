import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Gui4_JFrame extends JFrame {
	
	
	
	// icon & background color 
	private ImageIcon icon;
	private Container c;
	
	Gui4_JFrame()
	{
//		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		 setBounds(400,400, 500,300); // location + size
//		 setTitle("this is a title");
 
		setcomponents();
 	 }
	 
	
	public void setcomponents()
	{
		icon = new ImageIcon(getClass().getResource("owl.jpg"));
		this.setIconImage(icon.getImage());
		
		
		//color
		c=this.getContentPane();
		c.setBackground(Color.darkGray);
	}
	// end of icon
	
	
	

	public static void main(String[] args) {
 
		
		Gui4_JFrame frame = new Gui4_JFrame();
		
		
		frame.setVisible(true);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400,400, 500,300); // location + size
		frame.setTitle("this is a title");
		

	}

}
